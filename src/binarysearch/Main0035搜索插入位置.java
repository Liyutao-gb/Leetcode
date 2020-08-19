package binarysearch;

public class Main0035ËÑË÷²åÈëÎ»ÖÃ {
	public static void main(String[] args) {

		System.out.println(new Solution35().searchInsert(new int[] { 1, 2, 3, 5, 6 }, 2));
//		Arrays.binarySearch(a, key);
	}
}

class Solution35 {
	public int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target)
				high = mid - 1;
			else
				low = low + 1;
		}
		return low;
	}
}