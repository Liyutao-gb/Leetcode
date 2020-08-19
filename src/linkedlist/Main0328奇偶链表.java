package linkedlist;

public class Main0328∆Ê≈º¡¥±Ì {
	public static void main(String[] args) {

	}
}

class Solution328 {
	public ListNode oddEvenList(ListNode head) {
		ListNode first = new ListNode(0);
		ListNode low = first;
		ListNode second = new ListNode(0);
		ListNode high = second;

		while (head != null) {
			if (head != null) {
				low.next = head;
				low = low.next;
				head = head.next;
			}
			if (head != null) {
				high.next = head;
				high = high.next;
				head = head.next;
			}
		}
		high.next = null;
		low.next = second.next;
		return first.next;
	}
}