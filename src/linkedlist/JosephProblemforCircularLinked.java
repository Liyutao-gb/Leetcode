package linkedlist;

public class JosephProblemforCircularLinked {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		head.next = node;
		node.next = node1;
		node1.next = head;
		ListNode josephus1 = josephus1(head, 2);
		System.out.println(josephus1.val);
		
		int live = getLive(3, 2);
		System.out.println("������µĽڵ㣺" + live);
	}

	/**
	 * 1. ���������С�ڵ���1��ֱ�ӷ��أ�
	 * 2. �ڻ��������б���ÿ����㣬����תȦ��������ÿ����㱨����
	 * 3. ����������m����ɾ����ǰ������㣬����ʣ�½�����ɻ�״������������ɾ����
	 * 	    ֱ�����ֻʣһ�����.
	 */
	public static ListNode josephus1(ListNode head, int m) {
		if (head == null || head.next == null || m < 1)
			return head;

		ListNode last = head;
		while (last.next != head)
			last = last.next;
		
		int count = 0;
		while (head != last) {
			count++;
			if (count == m) {
				last.next = head.next;
				count = 0;
			} else {
				last = last.next;	// last = cur;
			}
			head = last.next;
		}
		return head;
	}
	
	/**
	 * ֤�����ó����ʣ�µ�һ�����λ��
	 */
	public static ListNode josephusKill2(ListNode head, int m) {
		if (head == null || head.next == null || m < 1)
			return head;

		int len = 1;
		ListNode cur = head.next;
		while (cur != head) {
			len++;
			cur = cur.next;
		}
		int live = getLive(len, m);
		while (live != 1) {
			live--;
			head = head.next;
		}
		head.next = head;
		return head;
	}
	
	// ���������Ⱥͱ������ּ�������Ľڵ�
	public static int getLive(int len, int m) {
		if (len == 1)
			return 1;
		return (getLive(len - 1, m) + m - 1) % len + 1;
	}
}
