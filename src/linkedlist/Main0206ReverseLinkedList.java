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

// ����
// 1 -> 2 -> 3 ��ת��1 <- 2 <- 3 preָ��3,curָ3����һ���null
class Solution206 {
	public ListNode reverseList(ListNode head) {
		ListNode cur = head;// ��ǰָ����
		ListNode pre = null;// ǰָ����
		while (cur != null) {
			ListNode newNext = cur.next;// ��ʱ�ڵ㣬�ݴ浱ǰ�ڵ����һ�ڵ㣬���ں���
			cur.next = pre; // ����ǰ�ڵ�ָ����ǰ��Ľڵ�
			pre = cur; 		// ǰָ�����
			cur = newNext;  // ��ǰָ�����
		}
		return pre;
	}
}

// �ݹ�
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

// ��ת˫������
class Solution00206 {
	public DoubleNode reverseList(DoubleNode head) {
		DoubleNode cur = head;
		DoubleNode pre = null;
		while (cur != null) {
			DoubleNode newNext = cur.next;
			cur.next = pre;
			cur.last = newNext;// �͵�����Ĳ�֮ͬ��
			pre = cur;
			cur = newNext;
		}
		return pre;
	}
}