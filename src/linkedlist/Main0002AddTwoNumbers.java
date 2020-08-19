package linkedlist;

public class Main0002AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(3);
		ListNode l2 = new ListNode(5);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(4);
		l1.next = node1;
		node1.next = node2;
		l2.next = node3;
		node3.next = node4;
		ListNode node = new Solution2().addTwoNumbers(l1, l2);
		while (node != null) {
			System.out.print(node.val + "  ");
			node = node.next;
		}
	}
}

class Solution2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int num1 = l1 != null ? l1.val : 0;
			int num2 = l2 != null ? l2.val : 0;
			carry = num1 + num2 + carry;
			cur.next = new ListNode(carry % 10);
			cur = cur.next;
			carry /= 10;
			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;
		}
		if (carry == 1)
			cur.next = new ListNode(1);
		return dummy.next;
	}
}