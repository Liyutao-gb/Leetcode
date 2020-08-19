package stack;

import java.util.Stack;

public class Main0844比较含退格的字符串 {
	public static void main(String[] args) {
		System.out.println(new Solution844().backspaceCompare("y#fo##f", "y#f#o##f"));
	}
}

class Solution844 {
	public boolean backspaceCompare(String S, String T) {
		Stack<Character> s = new Stack<>();
		Stack<Character> t = new Stack<>();
		
		for (Character c : S.toCharArray()) {
			if (!s.isEmpty() && c == '#')//
				s.pop();
			// '#'不能添加进来,加限制条件
			else if (c != '#')
				s.push(c);
		}
		for (Character c : T.toCharArray()) {
			if (c == '#' && !t.isEmpty())
				t.pop();
			else if (c != '#')
				t.push(c);
		}
		if (s.size() != t.size())
			return false;
		
		while (s.size() != 0) {
			if (!s.isEmpty() && !t.isEmpty() && s.pop() != t.pop())
				return false;
		}
		return true;
	}
}