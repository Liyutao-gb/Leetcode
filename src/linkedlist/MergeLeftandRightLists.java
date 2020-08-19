package linkedlist;

public class MergeLeftandRightLists {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		relocate(head);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	// 1 -> 2 -> 3 -> 4 -> 5 转化为 1 -> 3-> 2 -> 4 -> 5
	public static void relocate(ListNode head) {
		if (head == null || head.next == null)
			return;

		ListNode mid = head;
		ListNode right = head.next;
		while (right.next != null && right.next.next != null) {
			mid = mid.next;
			right = right.next.next;
		}
		right = mid.next;
		mid.next = null;// 分为两条链表
		merge(head, right);
	}

	// 1,2,3 4,5,6 和 1,2 3,4,5都ok
	public static void merge(ListNode left, ListNode right) {
		while (left.next != null) {
			ListNode next = right.next;
			right.next = left.next;
			left.next = right;
			left = right.next;
			right = next;
		}
		left.next = right;
	}
}