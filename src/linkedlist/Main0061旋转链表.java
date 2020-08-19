package linkedlist;

public class Main0061旋转链表 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		head.next = node;
		node.next = node1;
		ListNode node2 = new Solution61().rotateRight(head, 1);
		while (node2 != null) {
			System.out.print(node2.val + " ");
			node2 = node2.next;
		}
	}
}

// 单链表变为环状
class Solution61 {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null || k < 1)
			return head;

		int length = 0;
		ListNode cur = head;
		while (cur != null) {
			length++;
			cur = cur.next;
		}
		k %= length;

		cur = head;
		for (int i = 0; i < k; i++)
			cur = cur.next;
		ListNode slow = head;
		while (cur.next != null) {
			slow = slow.next;
			cur = cur.next;
		}
		cur.next = head;
		ListNode res = slow.next;
		slow.next = null;
		return res;
	}
}