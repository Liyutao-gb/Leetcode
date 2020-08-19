package sort;

import java.util.Random;
//★插入排序 3000ms	适用于样本小且基本有序时效率比较高
//(binarySort) 二分插入排序   双插入排序
//平均时间复杂度：O(n²) 最好：O(n) 最坏：O(n²)  空间复杂度：O(1)  稳定性：稳定
public class InsertSort {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 0, 8, 5, 1, 3, 9, 6, 7 };
		insertSort(arr);
		print(arr);

		// int[] arr = new int[80000];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = new Random().nextInt(100000);
		// }
		//
		// long l = System.currentTimeMillis();
		// insertSort(arr);
		// long m = System.currentTimeMillis();
		//
		// System.out.println(m - l);

	}

	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				swap(arr, j, j - 1);
			}
		}
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
