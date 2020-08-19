package sort;

import java.util.Arrays;
//计数排序 基数少、 数量多
//平均时间复杂度：O(n+k) 最好：O(n+k) 最坏：O(n+k)  空间复杂度：O(n+k)  稳定
public class CountSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 5, 4, 1, 4, 9, 8, 5, 6, 0, 4, 0, 2, 2 };
		System.out.println("arr :" + Arrays.toString(arr));
		
		int[] result = new int[arr.length];
		int[] count = new int[10];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		System.out.println("count:" + Arrays.toString(count));

//		for (int i = 0, j = 0; i < count.length; i++) {
//			while (count[i]-- > 0) result[j++] = i;
//		}

		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}
		System.out.println("count:" + Arrays.toString(count));

		for (int i = arr.length - 1; i >= 0; i--) {
			result[--count[arr[i]]] = arr[i];	// Key
		}
		
		System.out.print("result:" + Arrays.toString(result));
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
