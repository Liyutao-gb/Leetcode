package linkedlist;

public class Main0143重排链表 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		head.next = node;
		node.next = node1;
		node1.next = node2;
		new Solution143().reorderList(head);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}

// 1 -> 2 -> 3 -> 4 -> 5
// 1 ->2 -> 3   5 -> 4
class Solution143 {
	public void reorderList(ListNode head) {
		if (head == null)
			return;
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode right = reverse(slow.next);
		slow.next = null;

		ListNode left = head;			// 1 -> 2 -> 3
		while (left.next != null) {		// 6 -> 5 -> 4
			ListNode cur = right.next;	// 保留结点5
			right.next = left.next;		// 让6指向2
			left.next = right; 			// 让1指向6
			left = right.next; 			// 指针left指向2
			right = cur;				// 指针right指向之前保留的5
		}
		left.next = right; 				// Key  偶数结点会留下一个
	}

	public static ListNode reverse(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			ListNode temp = head.next;
			head.next = pre;
			pre = head;
			head = temp;
		}
		return pre;
	}
}