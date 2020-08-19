package middle;

import java.util.Stack;

public class Main0032最长有效括号 {
	public static void main(String[] args) {

		System.out.println(new Solution32().longestValidParentheses(")()())"));
	}
}

class Solution32 {
	public int longestValidParentheses(String s) {
		int max_ans = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else {
				stack.pop();
				if (stack.empty()) {
					stack.push(i);
				} else {
					max_ans = Math.max(max_ans, i - stack.peek());
				}
			}
		}
		return max_ans;
	}
}