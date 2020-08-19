package linkedlist;

public class Main0142LinkedListCycleⅡ {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		head.next = node;
		node.next = node1;
		node1.next = node;
		ListNode cycle = new Solution142().detectCycle(head);
		System.out.println(cycle.val);
	}
}

class Solution142 {
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null)
			return null;

		ListNode p1 = head;// p1和p2必须都指向头节点
		ListNode p2 = head;
		while (p2.next != null && p2.next.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2) {
				break;
			}
		}
		if (p2.next == null || p2.next.next == null) {
			return null;
		}
		p1 = head;
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
}