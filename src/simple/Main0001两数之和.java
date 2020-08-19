package simple;

import java.util.HashMap;
import java.util.Map;

public class Main0001两数之和 {
	public static void main(String[] args) {

		int[] b = new Solution01().twoSum(new int[] { 2, 7, 11, 15 }, 9);
		for (int i : b) {
			System.out.println(i);
		}
	}
}

class Solution01 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int num = target - nums[i];
			if (map.containsKey(num)) {
				return new int[] { map.get(num), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No twoSum solution");
	}
}

class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			int num = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == num) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No twoSum solution");
	}
}