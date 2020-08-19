package linkedlist;

import java.util.HashSet;

public class RemoveDuplicatesfromDisorderLists {
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(2);
		head.next = node;
		node.next = node1;
		delRepeatNode(head);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
	// 无序单链表中删除重复值
	public static void delRepeatNode(ListNode head) {
		if (head == null)
			return;

		HashSet<Integer> set = new HashSet<>();
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			if (set.contains(cur.val)) {
				pre.next = cur.next;
			} else {
				set.add(cur.val);
				pre = cur;
			}
			cur = cur.next;
		}
	}
}