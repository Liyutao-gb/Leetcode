package stack;

import java.util.Stack;
// 最小栈
public class Main0155MinStack {
	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(-2);
		stack.push(0);
		stack.push(-3);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.top());
		System.out.println(stack.getMin());
	}
}

// 非同步压栈
class MinStack {
	Stack<Integer> stackData;
	Stack<Integer> stackMin;

	/** initialize your data structure here. */
	public MinStack() {
		stackData = new Stack<Integer>();
		stackMin = new Stack<Integer>();
	}

	public void push(int x) {
		stackData.push(x);
		if (stackMin.isEmpty() || x <= getMin()) {
			stackMin.push(x);
		}
	}

	public void pop() {
		if (stackData.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		int val = stackData.pop();
		if (val == getMin())
			stackMin.pop();
	}

	public int top() {
		if (stackData.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		return stackData.peek();
	}

	public int getMin() {
		if (stackMin.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		return stackMin.peek();
	}
}

// 同步压栈
class MinStack1 {
	Stack<Integer> stackData;
	Stack<Integer> stackMin;

	/** initialize your data structure here. */
	public MinStack1() {
		stackData = new Stack<Integer>();
		stackMin = new Stack<Integer>();
	}

	public void push(int x) {
		stackData.push(x);
		if (stackMin.isEmpty() || x <= getMin()) {
			stackMin.push(x);
		} else {
			stackMin.push(getMin());
		}
	}

	public void pop() {
		if (stackData.isEmpty())
			throw new RuntimeException("Your stack is empty.");
		stackData.pop();
		stackMin.pop();
	}

	public int top() {
		if (stackData.isEmpty())
			throw new RuntimeException("Your stack is empty.");
		return stackData.peek();
	}

	public int getMin() {
		if (stackMin.isEmpty())
			throw new RuntimeException("Your stack is empty.");
		return stackMin.peek();
	}
}