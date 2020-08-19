package linkedlist;

public class Main0082RemoveDuplicatesfromSortedList¢ò {
	public static void main(String[] args) {

	}
}

class Solution82 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null && cur.next != null) {
			if (cur.val == cur.next.val) {
				int val = cur.val;
				while (cur != null && cur.val == val) {
					cur = cur.next;
				}
				pre.next = cur;
			} else {
				pre = cur;
				cur = cur.next;
			}
		}
		return head;
	}
}