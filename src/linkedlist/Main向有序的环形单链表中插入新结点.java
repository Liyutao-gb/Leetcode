package linkedlist;

public class Main������Ļ��ε������в����½�� {
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
		// ��������Ϊ��ʱ,��node����Լ�ָ���Լ�
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
		// ��numû���ҵ��ʵ���λ��ʱ,cur = head���˳�ѭ��
		pre.next = node;
		node.next = cur;
		return head.val < num ? head : node;
	}
}
