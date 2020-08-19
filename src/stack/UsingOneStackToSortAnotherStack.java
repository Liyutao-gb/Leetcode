package stack;

import java.util.Stack;

public class UsingOneStackToSortAnotherStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(1);
		stack.push(3);
		useStackToSortAnotherStack(stack);
		for (Integer i : stack) {
			System.out.print(i + " ");
		} 
	}
	
	/**
	 * ����ջstack��ʹ�ô�ջ����ջ�״Ӵ�С����
	 * help�д�ջ����ջ�״�С������
	 */
	public static Stack<Integer> useStackToSortAnotherStack(Stack<Integer> stack) {
		if (stack.empty())
			return new Stack<>();
		
		Stack<Integer> helper = new Stack<>();
		while (!stack.isEmpty()) {
			int val = stack.pop();
			while (!helper.isEmpty() && val > helper.peek()) {
				stack.push(helper.pop());
			}
			helper.push(val);
		}
		
		while (!helper.isEmpty()) {
			stack.push(helper.pop());
		}
		return stack;
	}
}