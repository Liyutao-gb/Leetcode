package stack;

import java.util.Stack;

public class Main1003����滻��Ĵ��Ƿ���Ч {
	public static void main(String[] args) {
		System.out.println(new Solution1003().isValid("aabcbc"));
	}
}

class Solution1003 {
	public boolean isValid(String S) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'c') {
				if (stack.empty() || stack.pop() != 'b')
					return false;
				if (stack.empty() || stack.pop() != 'a')
					return false;
			} else {
				stack.push(S.charAt(i));
			}
		}
		return stack.isEmpty();
	}
}

class Solution01003 {
	public boolean isValid(String S) {
		while (S.contains("abc"))
			S = S.replace("abc", "");
		return S.equals("");
	}
}