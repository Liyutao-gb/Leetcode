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
	 * 1. ��ջstack��ջ��Ԫ�ط��ز��Ƴ�������Ԫ������Ϊ1,2,3
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
	 * 2. ����һ��ջ���ݹ�شӺ���ǰ���Ԫ�ص�ջ������Ϊ 3,2,1
	 */
	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int last = getAndRemoveLastElement(stack);// ����ջ��Ԫ�أ�����Ϊ1��2��3
		reverse(stack);
		stack.push(last);	// �ݹ�شӺ���ǰ���Ԫ�أ�����Ϊ3��2��1
	}
}