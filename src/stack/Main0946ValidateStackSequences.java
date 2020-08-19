package stack;

import java.util.Stack;

public class Main0946ValidateStackSequences {
	public static void main(String[] args) {
		System.out.println(new Solution946().validateStackSequences(
				new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 5, 3, 2, 1 }));
	}
}

class Solution946 {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		if (pushed.length != popped.length)
			return false;
		
		int index = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < pushed.length; i++) {
			stack.push(pushed[i]);
			while (!stack.isEmpty() && stack.peek() == popped[index]) {
				stack.pop();
				index++;
			}
		}
		return stack.isEmpty();
	}
}