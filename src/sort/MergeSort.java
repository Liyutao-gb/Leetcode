package sort;

import java.util.Random;
//��鲢���� (���η�)  1600ms	 java���������Ĭ���㷨
//ƽ��ʱ�临�Ӷȣ�O(nlogn) ��ã�O(nlogn) ���O(nlogn) 
//�ռ临�Ӷȣ�O(n) С����������������ٵ�  �ȶ�(<=)
//Tim Sort�����O(n) �Ľ��Ĺ鲢����,����ֱ�ӷֳɺü�С��
//	���ǰ�����е����ֵС�ڵ��ں��������Сֵ����˵�����п���ֱ���γ�һ����������
//����Ҫ�ٹ鲢����֮����Ҫ�����������б�������������ʱ�临�Ӷȿ��Խ���O(n)
public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2 };
		sort(arr, 0, arr.length - 1);
		print(arr);

		// int[] arr = new int[8000000];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = new Random().nextInt(100000);
		// }
		// 
		// long l = System.currentTimeMillis();
		// sort(arr, 0, arr.length - 1);
		// long m = System.currentTimeMillis();
		//
		// System.out.println(m - l);

	}

	public static void sort(int[] arr, int left, int right) {
		if (left >= right)
			return;
		int mid = (left + right) / 2;// left + right���ܻ�Խ��
		sort(arr, left, mid);
		sort(arr, mid + 1, right);
		merge(arr, left, mid, right);
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];

		int l = left;
		int r = mid + 1;
		int k = 0;

		while (l <= mid && r <= right) {
			temp[k++] = arr[l] <= arr[r] ? arr[l++] : arr[r++];// <= �ȶ�
		}
		while (l <= mid) {
			temp[k++] = arr[l++];
		}
		while (r <= right) {
			temp[k++] = arr[r++];
		}

		for (int i = 0; i < temp.length; i++) {
			arr[left++] = temp[i];	// left + i
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
// 5 7
// 2 3
// 2 3 5 7
// 1 4
// 6 8
// 1 4 6 8
// 1 2 3 4 5 6 7 8