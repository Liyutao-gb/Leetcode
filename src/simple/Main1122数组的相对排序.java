package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main1122数组的相对排序 {
	public static void main(String[] args) {
		int[] a = new Solution1122().relativeSortArray(new int[] { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 },
				new int[] { 2, 1, 4, 3, 9, 6 });
		for (int i : a) {
			System.out.println(i);
		}
	}
}

class Solution1122 {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<>();
		int[] copyArr2 = new int[arr2.length];
		for (int i = 0; i < arr2.length; i++)
			copyArr2[i] = arr2[i];
		Arrays.sort(copyArr2);
		for (int i = 0; i < arr1.length; i++) {
			int res = Arrays.binarySearch(copyArr2, arr1[i]);
			if (res < 0)
				list.add(arr1[i]);
		}
		Collections.sort(list);
		int[] result = new int[arr1.length];
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == arr2[i])
					result[index++] = arr2[i];
			}
		}
		for (int i : list)
			result[index++] = i;
		return result;
	}
}

// Arrays.binarySearch()二分法查找必须是有序的数组
// 数组a复制给数组b 改变b同时a也改变