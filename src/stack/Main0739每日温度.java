package stack;

import java.util.Stack;

public class Main0739Ã¿ÈÕÎÂ¶È {
	public static void main(String[] args) {
		int[] is = new Solution739().dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
		for (int i : is) {
			System.out.println(i);
		}
	}
}

class Solution739 {
	public int[] dailyTemperatures(int[] T) {
		int[] res = new int[T.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < res.length; i++) {
			while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
				int n = stack.peek();
				res[stack.pop()] = i - n;
			}
			stack.push(i);
		}
		return res;
	}
}