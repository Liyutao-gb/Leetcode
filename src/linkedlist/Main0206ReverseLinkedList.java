package linkedlist;

public class Main0206ReverseLinkedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		head.next = node;
		node.next = node1;
		ListNode list = new Solution206().reverseList(head);
		while (list != null) {
			System.out.print(list.val + " ");
			list = list.next;
		}
	}
}

// 迭代
// 1 -> 2 -> 3 反转后：1 <- 2 <- 3 pre指向3,cur指3的下一结点null
class Solution206 {
	public ListNode reverseList(ListNode head) {
		ListNode cur = head;// 当前指针结点
		ListNode pre = null;// 前指针结点
		while (cur != null) {
			ListNode newNext = cur.next;// 临时节点，暂存当前节点的下一节点，用于后移
			cur.next = pre; // 将当前节点指向它前面的节点
			pre = cur; 		// 前指针后移
			cur = newNext;  // 当前指针后移
		}
		return pre;
	}
}

// 递归
class Solution0206 {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode res = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return res;
	}
}

// 反转双向链表
class Solution00206 {
	public DoubleNode reverseList(DoubleNode head) {
		DoubleNode cur = head;
		DoubleNode pre = null;
		while (cur != null) {
			DoubleNode newNext = cur.next;
			cur.next = pre;
			cur.last = newNext;// 和单链表的不同之处
			pre = cur;
			cur = newNext;
		}
		return pre;
	}
}