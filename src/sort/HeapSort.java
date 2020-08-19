package sort;

import java.util.Arrays;
import java.util.Random;
// ★按数组来说,父结点的左子结点对应的数组2*n+1,右子结点2*n+2
// 堆排序(二叉树)  2300ms
// 平均时间复杂度：O(nlogn) 最好：O(nlogn) 最坏：O(nlogn)  
// O(n) + O(nlogn) = O(nlogn)	空间复杂度：O(1)  不稳定
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
	 * 堆排序： 
	 * 	1、构建大顶堆 
	 * 	2、交换堆顶和末尾元素
	 *  3、继续构建大顶堆
	 */
	public static void sort(int[] arr) {
		for (int i = arr.length / 2 - 1; i >= 0; i--) {	// O(n)
			adjustHeap(arr, i, arr.length - 1);
		}
//		log2+log3+…+log(n-1)+log(n)≈log(n!) 可以证明log(n!)和nlog(n)是同阶函数
//		∵(n/2)n/2≤n!≤nn,
//		∴n/4log(n)=n/2log(n1/2)≤n/2log(n/2)≤log(n!)≤nlog(n)
		for (int t = arr.length - 1; t > 0; t--) {
			int temp = arr[t];
			arr[t] = arr[0];
			arr[0] = temp;
			adjustHeap(arr, 0, t - 1);
		}
	}

	// 核心: 二叉树调整为一个大顶堆 (最小堆:① ②)
	public static void adjustHeap(int[] arr, int start, int end) {
		int temp = arr[start];
		for (int child = start * 2 + 1; child <= end; child = child * 2 + 1) {
			if (child + 1 <= end && arr[child] < arr[child + 1])//比较左右孩子大小   ① 
				child++;
			if (arr[child] < temp)// 父节点比孩子结点大,因此不需要下沉    ② 
				break;
			arr[start] = arr[child]; // 结点下沉
			start = child;
		}
		arr[start] = temp;
	}
}
