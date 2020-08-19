package sort;

import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
//O(1) < O(logn) < O(n) < O(nlogn) < O(n²) < O(n³) < O(n^k) < O(2^n)
//★冒泡排序：基本不用，太慢   20s
//平均时间复杂度：O(n²) 最好：O(n) 最坏：O(n²)  空间复杂度：O(1)  稳定
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 0, 8, 5, 1, 3, 9, 6, 7 };
		bubbleSort(arr);
		print(arr);

		// int[] arr = new int[80000];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = (int) (Math.random() * 100000);//生成一个[0,100000)
		// // arr[i] = new Random().nextInt(100000);
		// }
		//
		// Date date1 = new Date();
		// SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd
		// HH:mm:ss");
		// System.out.println("排序前的时间:" + format.format(date1));
		//
		// bubbleSort(arr);
		//
		// Date date = new Date();
		// System.out.println("排序后的时间:" + format.format(date));

	}

	public static void bubbleSort(int[] arr) {
		boolean flag = true;
		for (int i = arr.length - 1; i > 0 && flag; i--) {
			flag = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					flag = true;
				}
			}
		}
	}

	public static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}