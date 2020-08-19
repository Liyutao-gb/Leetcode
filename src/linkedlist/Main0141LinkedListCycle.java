package linkedlist;

public class Main0141LinkedListCycle {
}

class Solution141 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		
		ListNode slow = head;
		ListNode fast = head.next;
		while (slow != fast) {
			if (fast.next == null || fast.next.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
}

class Solution0141 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		
		ListNode p1 = head;
		ListNode p2 = head;
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2) {
				return true;
			}
		}
		return false;
	}
}