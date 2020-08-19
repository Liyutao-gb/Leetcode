package sort;

import java.util.Arrays;
import java.util.Random;
// �ﰴ������˵,���������ӽ���Ӧ������2*n+1,���ӽ��2*n+2
// ������(������)  2300ms
// ƽ��ʱ�临�Ӷȣ�O(nlogn) ��ã�O(nlogn) ���O(nlogn)  
// O(n) + O(nlogn) = O(nlogn)	�ռ临�Ӷȣ�O(1)  ���ȶ�
public class HeapSort {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 6, 7, 9, 1, 8 };
		sort(arr);
		System.out.println(Arrays.toString(arr));

		// int[] arr = new int[8000000];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = new Random().nextInt(100000);
		// }
		//
		// long l = System.currentTimeMillis();
		// sort(arr);
		// long m = System.currentTimeMillis();
		//
		// System.out.println(m - l);
	}

	/**
	 * ������ 
	 * 	1�������󶥶� 
	 * 	2�������Ѷ���ĩβԪ��
	 *  3�����������󶥶�
	 */
	public static void sort(int[] arr) {
		for (int i = arr.length / 2 - 1; i >= 0; i--) {	// O(n)
			adjustHeap(arr, i, arr.length - 1);
		}
//		log2+log3+��+log(n-1)+log(n)��log(n!) ����֤��log(n!)��nlog(n)��ͬ�׺���
//		��(n/2)n/2��n!��nn,
//		��n/4log(n)=n/2log(n1/2)��n/2log(n/2)��log(n!)��nlog(n)
		for (int t = arr.length - 1; t > 0; t--) {
			int temp = arr[t];
			arr[t] = arr[0];
			arr[0] = temp;
			adjustHeap(arr, 0, t - 1);
		}
	}

	// ����: ����������Ϊһ���󶥶� (��С��:�� ��)
	public static void adjustHeap(int[] arr, int start, int end) {
		int temp = arr[start];
		for (int child = start * 2 + 1; child <= end; child = child * 2 + 1) {
			if (child + 1 <= end && arr[child] < arr[child + 1])//�Ƚ����Һ��Ӵ�С   �� 
				child++;
			if (arr[child] < temp)// ���ڵ�Ⱥ��ӽ���,��˲���Ҫ�³�    �� 
				break;
			arr[start] = arr[child]; // ����³�
			start = child;
		}
		arr[start] = temp;
	}
}
