package simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main0349两个数组的交集 {
	public static void main(String[] args) {

		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		int[] num = new Solution0349().intersection(nums1, nums2);
		for (int i : num) {
			System.out.println(i);
		}
	}
}

class Solution0349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		for (int n : nums1)
			set1.add(n);
		Set<Integer> set2 = new HashSet<>();
		for (int num : nums2)
			if (set1.contains(num))
				set2.add(num);
		int[] res = new int[set2.size()];
		int index = 0;
		for (int i : set2) {
			res[index++] = i;
		}
		return res;
	}
}

class Solution349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Arrays.sort(nums2);
		for (int i = 0; i < nums1.length; i++) {
			int res = Arrays.binarySearch(nums2, nums1[i]);
			if (res >= 0) {
				set.add(nums1[i]);
			}
		}
		int[] num = new int[set.size()];
		Iterator<Integer> iterator = set.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			num[i++] = iterator.next();
		}
		return num;
	}
}