package sort;

import java.util.Random;
//希尔排序   3 4 5 6 7 1  500ms
//平均时间复杂度：O(n^1.3) 最好：O(n^1.3) 最坏：O(n²)  空间复杂度：O(1)  不稳
public class ShellSort {
	public static void main(String[] args) {
		int[] arr = { 9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2 };
		shellSort(arr);
		print(arr);

		// int[] arr = new int[80000];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = new Random().nextInt(100000);
		// }
		//
		// long l = System.currentTimeMillis();
		// shellSort(arr);
		// long m = System.currentTimeMillis();
		//
		// System.out.println(m - l);
	}

	public static void shellSort(int[] arr) {
		int h = 1;
		while (h <= arr.length / 3)// Knuth序列
			h = h * 3 + 1;

		for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
			for (int i = gap; i < arr.length; i++) {
				for (int j = i; j >= gap; j -= gap) {
					if (arr[j] < arr[j - gap]) {
						swap(arr, j, j - gap);
					}
				}
			}
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