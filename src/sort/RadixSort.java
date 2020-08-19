package sort;

import java.util.Arrays;
import java.util.Random;
//桶排序    400ms (空间换时间) 需要占用大量的Out-place
//如果有负数 尽量用其他排序 
//平均时间复杂度：O(n+k) 最好：O(n+k) 最坏：O(n平方)  空间复杂度：O(n+k)  稳定
public class RadixSort {
	public static void main(String[] args) {
		 int[] arr = {53,3,542,748,14,214};
		 sort(arr);
		 System.out.println(Arrays.toString(arr));

		//80000000 * 11 * 4 / 1024 / 1024 / 1024 = 3.3G
//		int[] arr = new int[8000000];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = new Random().nextInt(100000);
//		}
//
//		long l = System.currentTimeMillis();
//		sort(arr);
//		long m = System.currentTimeMillis();
//
//		System.out.println(m - l);

	}

	public static void sort(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int maxLength = (max + "").length();

		int[][] bucket = new int[10][arr.length];// 十个桶
		int[] bucketCounts = new int[10];// 每个桶存放的元素

		for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {

			for (int j = 0; j < arr.length; j++) {
				int digit = arr[j] / n % 10;
				bucket[digit][bucketCounts[digit]] = arr[j];
				bucketCounts[digit]++;
			}

			int index = 0;
			for (int j = 0; j < bucket.length; j++) {
				if (bucketCounts[j] != 0) {
					for (int k = 0; k < bucketCounts[j]; k++) {
						arr[index++] = bucket[j][k];
					}
				}
				bucketCounts[j] = 0;
			}
		}
	}
}