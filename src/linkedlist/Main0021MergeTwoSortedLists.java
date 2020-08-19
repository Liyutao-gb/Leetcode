package linkedlist;

// 21合并两个有序链表、23合并K个排序链表
public class Main0021MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode l2 = new ListNode(2);
		ListNode node3 = new ListNode(5);
		l1.next = node1;
		node1.next = node2;
		l2.next = node3;
		ListNode node = new Solution21().mergeTwoLists(l1, l2);
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}

// 递归
class Solution21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
}

// 迭代
class Solution021 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode cur = dummy;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				cur.next = l1;
				l2 = l2.next;
			} else {
				cur.next = l2;
				l1 = l1.next;
			}
			cur = cur.next;
		}
		cur.next = l1 == null ? l2 : l1;
		return dummy.next;
	}
}