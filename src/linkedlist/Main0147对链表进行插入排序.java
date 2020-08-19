package linkedlist;

public class Main0147对链表进行插入排序 {
	public static void main(String[] args) {

	}
}

class Solution147 {
	public ListNode insertionSortList(ListNode head) {
		if (head == null)
			return null;
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		dummy.next = head;
		ListNode cur = dummy;
		while (head != null) {
			ListNode tmp = dummy;
			if (head.val >= cur.val) {
				cur = head;
			} else {
				while (tmp.next.val < head.val) {
					tmp = tmp.next;
				}
				cur.next = head.next;
				head.next = tmp.next;
				tmp.next = head;
			}
			head = cur.next;
		}
		return dummy.next;
	}
}