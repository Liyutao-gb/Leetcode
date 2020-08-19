package stack;

import java.util.Arrays;
import java.util.Stack;

public class Main0503下一个更大元素Ⅱ {
	public static void main(String[] args) {
		int[] is = new Solution503().nextGreaterElements(new int[] { 1, 2, 3, 4 });
		for (int i : is) {
			System.out.println(i);
		}
	}
}

class Solution503 {
	public int[] nextGreaterElements(int[] nums) {
		int length = nums.length;
		int[] res = new int[length];
		Arrays.fill(res, -1);
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < 2 * length; i++) {
			while (!stack.isEmpty() && nums[stack.peek()] < nums[i % length]) {
				res[stack.pop()] = nums[i % length];
			}
			if (i < length) {
				stack.push(i);
			}
		}
		return res;
	}
}