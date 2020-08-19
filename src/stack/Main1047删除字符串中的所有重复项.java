package stack;

import java.util.Stack;

public class Main1047删除字符串中的所有重复项 {
	public static void main(String[] args) {
		System.out.println(new Solution1047().removeDuplicates("abbaca"));
	}
}

class Solution1047 {
	public String removeDuplicates(String S) {
		Stack<Character> stack = new Stack<>();

		for (Character c : S.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		StringBuffer res = new StringBuffer();
		for (Character c : stack) {
			res.append(c);
		}
		return res.toString();
	}
}