package linkedlist;

public class Main0092ReverseLinkedList¢ò {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(5);
		head.next = node;
		node.next = node1;
		node1.next = node2;
		node2.next = node3;
		ListNode between = new Solution92().reverseBetween(head, 2, 4);
		while (between != null) {
			System.out.print(between.val + " ");
			between = between.next;
		}
	}
}

//1->2->3->4->5 from = 2, to = 4
class Solution092 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null || head.next == null)
			return head;

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode con = dummy;
		for (int i = 0; i < m - 1; i++)
			pre = pre.next;
		for (int i = 0; i < n; i++)
			con = con.next;

		ListNode tail = pre.next, cur = con.next;
		con.next = null; // Key
		pre.next = reverse(tail);
		tail.next = cur;
		return dummy.next;
	}

	public ListNode reverse(ListNode head) {
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

//  1  ->  2  ->  3  ->  4  ->  5  from = 2, to = 4
// pre    tail          end    cur
class Solution92 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null || head.next == null || m > n)
			return head;

		ListNode cur = head, pre = null;
		while (m > 1) {
			pre = cur;
			cur = cur.next;
			m--;
			n--;
		}
		
		ListNode con = pre, tail = cur;
		while (n > 0) {
			ListNode newNext = cur.next;
			cur.next = con;
			con = cur;
			cur = newNext;
			n--;
		}
		if (pre != null)
			pre.next = con;
		else
			head = con;
		tail.next = cur;
		return head;
	}
}
