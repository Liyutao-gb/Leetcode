package stack;

import java.util.Stack;

public class Main0682棒球比赛 {
	public static void main(String[] args) {
		System.out.println(new Solution682().calPoints(new String[] { "57", "D", "-3", "-58", "D", "77", "+", "C", "+",
				"+", "38", "78", "-6", "24", "-46", "+", "31", "20", "D", "-81" }));
	}
}

class Solution682 {
	public int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
		// String regEx = "^[-\\+]?[\\d]*$";
		int sum = 0;
		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("C")) {//弹出上一轮分数
				sum -= stack.pop();
			} else if (ops[i].equals("D")) {
				stack.push(stack.peek() * 2);//加入当轮分数
				sum += stack.peek();
			} else if (ops[i].equals("+")) {
				int first = stack.pop();
				int preNum = first + stack.peek();
				stack.push(first);
				stack.push(preNum);//加入当轮分数
				sum += stack.peek();
			} else {
				stack.push(Integer.parseInt(ops[i]));//加入当轮分数
				sum += stack.peek();
			}
		}
		return sum;
	}
}