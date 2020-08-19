package sort;

import java.util.Random;
//★归并排序 (分治法)  1600ms	 java对象排序的默认算法
//平均时间复杂度：O(nlogn) 最好：O(nlogn) 最坏：O(nlogn) 
//空间复杂度：O(n) 小数组调用完立马销毁掉  稳定(<=)
//Tim Sort：最好O(n) 改进的归并排序,排序直接分成好几小块
//	如果前段序列的最大值小于等于后段序列最小值，则说明序列可以直接形成一段有序序列
//不需要再归并，反之则需要。所以在序列本身有序的情况下时间复杂度可以降至O(n)
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
		int mid = (left + right) / 2;// left + right可能会越界
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
			temp[k++] = arr[l] <= arr[r] ? arr[l++] : arr[r++];// <= 稳定
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