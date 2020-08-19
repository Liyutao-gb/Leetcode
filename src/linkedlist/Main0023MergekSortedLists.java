package linkedlist;

public class Main0023MergekSortedLists {
	public static void main(String[] args) {
		
	}
}

class Solution23 {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length <= 0)
			return null;
		return merge(lists, 0, lists.length - 1);
	}

	// 1,2,3,4 分别代表一条链表	l1返回1、2的合并链表,l2返回3、4的合并链表
	// 最后返回1,2,3,4的合并链表
	public ListNode merge(ListNode[] lists, int left, int right) {
		if (left == right)
			return lists[left];
		int mid = (left + right) / 2;
		ListNode l1 = merge(lists, left, mid);
		ListNode l2 = merge(lists, mid + 1, right);
		return mergeTwoList(l1, l2);
	}

	public ListNode mergeTwoList(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeTwoList(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoList(l1, l2.next);
			return l2;
		}
	}
}