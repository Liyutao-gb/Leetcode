package stack;

import java.util.Stack;

// 两个栈实现队列
class MyQueue {
	Stack<Integer> stack1;
	Stack<Integer> stack2;

	/** Initialize your data structure here. */
	public MyQueue() {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		stack1.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		if (stack2.isEmpty() && stack1.isEmpty()) {
			throw new RuntimeException("Queue is empty.");
		}
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	/** Get the front element. */
	public int peek() {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			throw new RuntimeException("Queue is empty.");
		}
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return stack2.isEmpty() && stack1.isEmpty();
	}
}