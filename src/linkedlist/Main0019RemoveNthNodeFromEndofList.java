package linkedlist;

public class Main0019RemoveNthNodeFromEndofList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		head.next = node1;
		node1.next = node2;
		ListNode node = new Solution19().removeNthFromEnd(head, 3);
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}

// 方法一：两个指针
class Solution19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || n < 1)
			return head;

		ListNode fast = head;
		for (int i = 0; i < n - 1; i++) {
			fast = fast.next;
		}
		if (fast == null)
			return head;
		if (fast.next == null)
			return head.next;

		ListNode slow = head;
		while (fast.next.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
}

// 删除第L-n+1个结点，从头开始遍历，找到第L-n个结点
class Solution0019 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || n <= 0)
			return head;

		int length = 0;
		ListNode cur = head;
		while (cur != null) {
			length++;
			cur = cur.next;
		}
		if (n > length)
			return head;
		if (n == length)
			return head.next;

		length -= n;
		cur = head;
		for (int i = 1; i < length; i++) {
			cur = cur.next;
		}
		cur.next = cur.next.next;
		return head;
	}
}

// 方法二
class Solution019 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || n <= 0)
			return head;

		int length = 0;
		ListNode cur = head;
		while (cur != null) {
			length++;
			cur = cur.next;
		}
		if (n > length)
			return head;
		if (n == length)
			return head.next;

		length -= n;
		cur = head;
		for (int i = 1; i < length; i++) {
			cur = cur.next;
		}
		cur.next = cur.next.next;
		return head;
	}
}

// 双向链表删除倒数第N个节点
class Solution00019 {
	public DoubleNode removeNthFromEnd(DoubleNode head, int n) {
		if (head == null || n < 1)
			return head;

		DoubleNode cur = head;
		while (cur != null) {
			n--;
			cur = cur.next;
		}
		if (n > 0)
			return head;
		if (n == 0) {
			head = head.next;
			head.last = null;
			return head;
		}

		cur = head;
		while (n < -1) {
			n++;
			cur = cur.next;
		}
		// cur → cur.next → newNext
		DoubleNode newNext = cur.next.next;
		cur.next = newNext;
		if (newNext != null) {
			newNext.last = cur;
		}
		return head;
	}
}