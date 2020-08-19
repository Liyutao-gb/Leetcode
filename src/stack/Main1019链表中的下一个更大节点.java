package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import linkedlist.ListNode;

public class Main1019�����е���һ������ڵ� {
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
		// ����һ��ջ stack,���ջ����洢���Ƕ�Ӧλ�õ� list Ԫ�ؼ���֮��Ԫ��������ֵ
		Stack<Integer> stack = new Stack<>();
		int[] ans = new int[size];
		// �� list �д������������stack �з��Ǳ� list.get(i) С�Ķ� pop ��ȥ
		// ���� stack ʣ�µ�Ԫ�ض��Ǳ� list.get(i) �����Ԫ�ء�
		for (int i = list.size() - 1; i >= 0; i--) {// 1,7,5,1,9,2,5,1
			while (!stack.empty() && stack.peek() <= list.get(i)) {
				stack.pop();
			}
			ans[i] = stack.empty() ? 0 : stack.peek();
			stack.push(list.get(i));
		}
		return ans;
	}
}