package stack;

import java.util.Stack;
// 逆波兰表达式求解
public class Main0150EvaluateReversePolishNotation {
	public static void main(String[] args) {
		System.out.println(new Solution150().evalRPN(new String[] { "2", "1", "+", "3", "*" }));
	}
}

class Solution150 {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		for (String s : tokens) {
			if (s.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			} else if (s.equals("-")) {
				stack.push(-stack.pop() + stack.pop());
			} else if (s.equals("*")) {
				stack.push(stack.pop() * stack.pop());
			} else if (s.equals("/")) {
				int num1 = stack.pop();
				stack.push(stack.pop() / num1);
			} else {
				stack.push(Integer.parseInt(s));
			}
		}
		return stack.pop();
	}
}