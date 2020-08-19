package stack;

import java.util.Stack;

public class InvertOneStackWithRecursiveandStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		reverse(stack);
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

	/**
	 * 1. 将栈stack的栈底元素返回并移除。返回元素依次为1,2,3
	 */
	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int val = stack.pop();
		if (stack.isEmpty()) {
			return val;
		}
		int last = getAndRemoveLastElement(stack);
		stack.push(val);
		return last;
	}

	/**
	 * 2. 逆序一个栈。递归地从后往前添加元素到栈，依次为 3,2,1
	 */
	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int last = getAndRemoveLastElement(stack);// 返回栈底元素，依次为1→2→3
		reverse(stack);
		stack.push(last);	// 递归地从后往前添加元素，依次为3→2→1
	}
}