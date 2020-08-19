package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main0496下一个更大元素 {
	public static void main(String[] args) {
		int[] num = new Solution496().nextGreaterElement(new int[] { 1, 2, 3, 1 }, new int[] { 2, 1, 3, 4 });
		for (int i : num) {
			System.out.println(i);
		}
	}
}

class Solution496 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack<Integer> stack = new Stack<>();
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums2) {
			while (!stack.isEmpty() && stack.peek() < num) {
				map.put(stack.pop(), num);
			}
			stack.push(num);
		}

		int[] result = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			result[i] = map.getOrDefault(nums1[i], -1);
		}
		return result;
	}
}