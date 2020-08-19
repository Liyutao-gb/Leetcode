package binarysearch;

public class Main0033ËÑË÷Ğı×ªÅÅĞòÊı×é {
	public static void main(String[] args) {

		System.out.println(new Solution33().search(new int[] {4,5,6,7,8,1,2,3}, 2));
	}
}

class Solution33 {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;

		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] >= nums[start]) {
				if (target >= nums[start] && target < nums[mid])
					end = mid - 1;
				else
					start = mid + 1;
			} else {
				if (target > nums[mid] && target <= nums[end])
					start = mid + 1;
				else
					end = mid - 1;
			}
		}
		return -1;
	}
}