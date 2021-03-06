package stack;

import java.util.Stack;

public class Main0071��·�� {
	public static void main(String[] args) {
		System.out.println(new Solution71().simplifyPath("/a//b////c/d//././/.."));
	}
}

class Solution71 {
	public String simplifyPath(String path) {
		String[] s = path.split("/");
		Stack<String> stack = new Stack<>();
		
		for (int i = 0; i < s.length; i++) {
			if (!stack.isEmpty() && s[i].equals(".."))
				stack.pop();
			else if (!s[i].equals("") && !s[i].equals(".") && !s[i].equals(".."))
				stack.push(s[i]);
		}
		if (stack.isEmpty())
			return "/";

		StringBuffer res = new StringBuffer();
		for (int i = 0; i < stack.size(); i++) {
			res.append("/" + stack.get(i));
		}
		return res.toString();
	}
}