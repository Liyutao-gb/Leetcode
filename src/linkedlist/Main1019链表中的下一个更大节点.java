package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main1019链表中的下一个更大节点 {
	public static void main(String[] args) {

	}
}

class Solution1019 {
	public int[] nextLargerNodes(ListNode head) {
		if (head == null)
			return null;
		
		List<Integer> list = new ArrayList<>();
		int size = 0;
		while (head != null) {
			list.add(head.val);
			size++;
			head = head.next;
		}
		Stack<Integer> stack = new Stack<>();
		int[] ans = new int[size];
		for (int i = list.size() - 1; i >= 0; i--) {
			while (!stack.empty() && list.get(i) >= stack.peek()) {
				stack.pop();
			}
			ans[i] = stack.empty() ? 0 : stack.peek();
			stack.push(list.get(i));
		}
		return ans;
	}
}