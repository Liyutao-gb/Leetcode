package simple;

import java.util.Arrays;

public class Main0581最短无序连续子数组 {
	public static void main(String[] args) {

		System.out.println(new Solution581().findUnsortedSubarray(new int[] { 2, 6, 4, 8,	 10, 9, 15 }));
	}
}

class Solution581 {
	public int findUnsortedSubarray(int[] nums) {
		int[] copyNums = new int[nums.length];
		for (int i = 0; i < copyNums.length; i++) {
			copyNums[i] = nums[i];
		}
		Arrays.sort(copyNums);
		int low = 0;
		int high = nums.length - 1;
		while (nums[low] == copyNums[low] && low < high) {
			low++;
		}
		while (nums[high] == copyNums[high] && low < high) {
			high--;
		}
		return low == high ? 0 : high - low + 1;
	}
}
