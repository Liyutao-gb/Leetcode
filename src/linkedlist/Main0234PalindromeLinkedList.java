package linkedlist;

import java.util.Stack;

public class Main0234PalindromeLinkedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(1);
		head.next = node;
		node.next = node1;
		boolean b = new Solution234().isPalindrome(head);
		System.out.println(b);
	}
}

class Solution234 {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;

		ListNode p1 = head;
		ListNode p2 = head;
		while (p2.next != null && p2.next.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		p2 = reverse(p1.next);
		p1.next = null;

		p1 = head;
		while (p1 != null && p2 != null) {
			if (p1.val != p2.val)
				return false;
			p1 = p1.next;
			p2 = p2.next;
		}
		return true;
	}

	public ListNode reverse(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			ListNode newNext = head.next;
			head.next = pre;
			pre = head;
			head = newNext;
		}
		return pre;
	}
}

class Solution0234 {
	public boolean isPalindrome(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		ListNode cur = head;
		while (cur != null) {
			stack.push(cur);
			cur = cur.next;
		}
		cur = head;
		while (cur != null) {
			if (cur.val != stack.pop().val) {
				return false;
			}
			cur = cur.next;
		}
		return true;
	}
}