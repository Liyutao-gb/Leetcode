package linkedlist;

public class Main0203RemoveLinkedListElements {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		head.next = node;
		node.next = node1;
		ListNode node2 = new Solution203().removeElements(head, 2);
		while (node2 != null) {
			System.out.print(node2.val + " ");
			node2 = node2.next;
		}
	}
}

// 原链表Operation
class Solution203 {
	public ListNode removeElements(ListNode head, int val) {
		while (head != null) {
			if (head.val != val)
				break;
			head = head.next;
		}
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			if (cur.val == val)
				pre.next = cur.next;
			else
				pre = cur;
			cur = cur.next;
		}
		return head;
	}
}

// 新链表Operation
class Solution0203 {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return head;
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode cur = dummy;
		while (cur.next != null) {
			if (cur.next.val == val) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}
		}
		return dummy.next;
	}
}

// 递归
class Solution00203 {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return head;
		head.next = removeElements(head.next, val); // 递归到最后,从后往前delete
		if (head.val == val) {
			return head.next;
		} else {
			return head;
		}
	}
}