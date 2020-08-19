package linkedlist;

public class Main0876������м��� {
	public static void main(String[] args) {

	}
}

class Solution876 {
	public ListNode middleNode(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next.next != null) {
			fast = fast.next.next; 
			slow = slow.next;
		}
		if (fast.next != null) {
			return slow.next;
		}
		return slow;
	}
}