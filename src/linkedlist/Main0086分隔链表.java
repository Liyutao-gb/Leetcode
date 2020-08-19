package linkedlist;

public class Main0086∑÷∏Ù¡¥±Ì {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(4);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		head.next = node;
		node.next = node1;
		node1.next = node2;
		ListNode partition = new Solution86().partition(head, 3);
		while (partition != null) {
			System.out.print(partition.val + " ");
			partition = partition.next;
		}
	}
}

class Solution86 {
	public ListNode partition(ListNode head, int x) {
		ListNode first = new ListNode(0);
		ListNode low = first;
		ListNode second = new ListNode(0);
		ListNode high = second;

		while (head != null) {
			if (head.val < x) {
				low.next = head;
				low = head;
			} else {
				high.next = head;
				high = head;
			}
			head = head.next;
		}
		high.next = null; 		// Key
		low.next = second.next;
		return first.next;
	}
}