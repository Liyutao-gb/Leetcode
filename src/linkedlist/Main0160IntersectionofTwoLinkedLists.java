package linkedlist;

public class Main0160IntersectionofTwoLinkedLists {
	public static void main(String[] args) {
		ListNode headA = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode headB = new ListNode(1);
		headA.next = node1;
		headB.next = node1;
		ListNode node = new Solution160().getIntersectionNode(headA, headB);
		System.out.println(node.val);
	}
}

// 判断两条单链表的最后一个节点是否相交,再求相交节点
class Solution160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		int lenA = 1, lenB = 1;
		ListNode p, q;
		for (p = headA; p.next != null; p = p.next)
			lenA++;
		for (q = headB; q.next != null; q = q.next)
			lenB++;
		if (p != q)
			return null;

		p = headA;
		q = headB;
		if (lenA > lenB) {
			for (int i = 0; i < lenA - lenB; i++)
				p = p.next;
		} else {
			for (int i = 0; i < lenB - lenA; i++)
				q = q.next;
		}
		while (p != q) {
			p = p.next;
			q = q.next;
		}
		return p;
	}
}

class Solution0160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		ListNode p1 = headA;
		ListNode p2 = headB;
		while (p1 != p2) {
			p1 = p1 == null ? headB : p1.next;
			p2 = p2 == null ? headA : p2.next;
		}
		return p1;
	}
}