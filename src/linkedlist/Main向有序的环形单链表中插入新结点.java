package linkedlist;

public class Main向有序的环形单链表中插入新结点 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		head.next = node1;
		node1.next = node2;
		node2.next = head;
		ListNode node = insertNode(head, 4);
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	public static ListNode insertNode(ListNode head, int num) {
		ListNode node = new ListNode(num);
		// 环形链表为空时,让node结点自己指向自己
		if (head == null) {
			node.next = node;
			return node;
		}
		ListNode pre = head;
		ListNode cur = head.next;
		while (cur != head) {
			if (pre.val <= num && num <= cur.val) {
				break;
			}
			pre = cur;
			cur = cur.next;
		}
		// 当num没有找到适当的位置时,cur = head会退出循环
		pre.next = node;
		node.next = cur;
		return head.val < num ? head : node;
	}
}
