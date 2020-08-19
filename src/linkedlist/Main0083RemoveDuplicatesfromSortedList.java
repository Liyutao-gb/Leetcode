package linkedlist;

public class Main0083RemoveDuplicatesfromSortedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(2);
		head.next = node;
		node.next = node1;
		ListNode node2 = new Solution83().deleteDuplicates(head);
		while (node2 != null) {
			System.out.print(node2.val + " ");
			node2 = node2.next;
		}
	}
}

class Solution83 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		
		ListNode cur = head;
		while (cur.next != null) {
			if (cur.val == cur.next.val)
				cur.next = cur.next.next;
			else
				cur = cur.next;
		}
		return head;
	}
}