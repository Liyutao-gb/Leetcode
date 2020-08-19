package stack;

import java.util.Stack;

public class Main0921使括号有效的最少添加 {
	public static void main(String[] args) {

		System.out.println(new Solution921().minAddToMakeValid("()))(("));
	}
}

class Solution921 {
	public int minAddToMakeValid(String S) {
		Stack<Character> stack = new Stack<>();
		
		for (Character c : S.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == '(' && c == ')')
				stack.pop();
			else
				stack.push(c);
		}
		return stack.size();
	}
}