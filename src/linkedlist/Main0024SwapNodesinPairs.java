package linkedlist;

public class Main0024SwapNodesinPairs {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(2);
		head.next = node;
		node.next = node1;
		node1.next = node2;
		ListNode pairs = new Solution024().swapPairs(head);
		while (pairs != null) {
			System.out.print(pairs.val + " ");
			pairs = pairs.next;
		}
	}
}

// ����
class Solution24 {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		// cur �� start �� end
		while (pre.next != null && pre.next.next != null) {
			ListNode start = pre.next;
			ListNode end = pre.next.next;
			pre.next = end;
			start.next = end.next;	// ��
			end.next = start;		// �ۺ͢�˳���ܻ���������������
			pre = start;
		}
		return dummy.next;
	}
}

// �ݹ�
class Solution024 {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		
		// �����ڵ�˳��:head, next, swapPairs(next.next)
		ListNode next = head.next;
		head.next = swapPairs(next.next);
		next.next = head;
		return next;
	}
}