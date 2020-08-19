package stack;

import java.util.Stack;
// ÓÐÐ§µÄÀ¨ºÅ
public class Main0020ValidParentheses {
	public static void main(String[] args) {
		System.out.println(new Solution20().isValid("([]()){}"));
	}
}

class Solution20 {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char[] c = s.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(')
				stack.push(')');
			else if (c[i] == '[')
				stack.push(']');
			else if (c[i] == '{')
				stack.push('}');
			else if (stack.empty() || c[i] != stack.pop())
				return false;
		}
		return stack.empty();
	}
}

class Solution020 {
	public boolean isValid(String s) {
		if (s.length() % 2 != 0)
			return false;

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '(':
			case '[':
			case '{':
				stack.push(c);
				break;
			case ')':
				if (stack.empty() || stack.pop() != '(')
					return false;
				break;
			case ']':
				if (stack.empty() || stack.pop() != '[')
					return false;
				break;
			case '}':
				if (stack.empty() || stack.pop() != '{')
					return false;
				break;
			}
		}
		return stack.empty();
	}
}