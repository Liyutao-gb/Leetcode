package stack;

//import java.util.Deque;
//import java.util.LinkedList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(123);
		stack.push(12);
		System.out.println(stack.indexOf(12));
	}
}
