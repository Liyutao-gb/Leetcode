package binarysearch;

public class Main0081ËÑË÷Ğı×ªÅÅĞòÊı×é¢ò {
	public static void main(String[] args) {

		System.out.println(new Solution81().search(new int[] { 1, 3 }, 2));
	}
}

class Solution81 {
	public boolean search(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target)
				return true;
			if (nums[left] == nums[mid]) {
				left++;
				continue;
			}
			if (nums[mid] > nums[left]) {
				if (target >= nums[left] && target < nums[mid])
					right = mid - 1;
				else
					left = mid + 1;
			} else {
				if (target > nums[mid] && target <= nums[right])
					left = mid + 1;
				else
					right = mid - 1;
			}
		}
		return false;
	}
}