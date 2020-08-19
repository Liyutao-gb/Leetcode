package simple;

import java.util.HashMap;
import java.util.Map;

public class Main0167两数之和Ⅱ {
	public static void main(String[] args) {

		int[] a = new Solution167().twoSum(new int[] { 2, 7, 11, 15 }, 9);
		for (int i : a) {
			System.out.println(i);
		}
	}
}

class Solution167 {
	public int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;
		while (numbers[start] + numbers[end] != target) {
			if (numbers[start] + numbers[end] < target) {
				start++;
			} else {
				end--;
			}
		}
		return new int[] { start + 1, end + 1 };
	}
}

class Solution0167 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int num = target - nums[i];
			if (map.containsKey(num)) {
				return new int[] { map.get(num) + 1, i + 1 };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No twoSum solution");
	}
}