package sort;

import java.util.Arrays;
import java.util.Random;
// ★快速排序 (递归) 速度快 900ms
// 平均时间复杂度：O(nlogn) 最好：O(nlogn) 最坏：O(n²)排好序(升序或逆序)的数组
// 空间复杂度：O(logn)  不稳定
// “荷兰国旗”(Dutch National Flag) 工业界常用三项切分
// 快速排序为什么快？
//	      快速排序快的主要原因是大大减少了比较和交换的次数，因为按基准数切分的两半数组，
// 在一个数组里面的数据是绝对不会和第二个数组里面的数字产生比较的机会的，所以大幅度
// 降低了做无用功的机会。
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 7, 3, 2, 8, 1, 9, 5, 4, 6, 0};
		sort(arr, 0, arr.length - 1);
		print(arr);
//		Arrays.sort(a);

//		 int[] arr = new int[8000000];
//		 for (int i = 0; i < arr.length; i++) {
//		 arr[i] = new Random().nextInt(100000);
//		 }
//		
//		 long l = System.currentTimeMillis();
//		 sort(arr, 0, arr.length - 1);
//		 long m = System.currentTimeMillis();
//		
//		 System.out.println(m - l);

	}

	// 1.数组最后一个值为基准
	public static void sort(int[] arr, int left, int right) {
		if (left >= right)
			return;
		int mid = partition(arr, left, right);
		sort(arr, left, mid - 1);
		sort(arr, mid + 1, right);
	}

	private static int partition(int[] arr, int left, int right) {
		int l = left;
		int r = right - 1;

		while (l <= r) {// 4, 6
			while (l <= r && arr[l] <= arr[right])// 7, 3, 2, 8, 1, 9, 5, 4, 6, 10
				l++;
			while (l <= r && arr[r] > arr[right])// 4, 3, 6, 1, 2, 9, 8, 6, 7, 6
				r--;
			if (l < r)
				swap(arr, l, r);
		}
		swap(arr, l, right);
		// System.out.println(Arrays.toString(arr));
		return l;
	}

	// 2.数组第一个值为基准
	public static void sorted(int a[], int low, int high) {
		if (a == null || low >= high)
			return;

		int i = low;
		int j = high;
		int key = a[low];

		while (i < j) { // 此处的while循环结束，则完成了元素key的位置调整
			while (i < j && key <= a[j]) {
				j--;
			}
			a[i] = a[j]; // j 指向的小值赋给左边的 i
			while (i < j && key >= a[i]) {
				i++;
			}
			a[j] = a[i];// i 指向的大值赋给右边的 j
			a[i] = key; // 中间值赋给 中间的 i
		}
		sort(a, low, i - 1);
		sort(a, i + 1, high);
	}

	static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}