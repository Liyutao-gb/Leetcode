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
		System.out.println("最后留下的节点：" + live);
	}

	/**
	 * 1. 如果链表长度小于等于1，直接返回；
	 * 2. 在环形链表中遍历每个结点，不断转圈，不断让每个结点报数；
	 * 3. 当报数到达m，就删除当前报数结点，并把剩下结点连成环状，继续报数、删除，
	 * 	    直到最后只剩一个结点.
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
	 * 证明：得出最后剩下的一个结点位置
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
	
	// 利用链表长度和报数数字计算出存活的节点
	public static int getLive(int len, int m) {
		if (len == 1)
			return 1;
		return (getLive(len - 1, m) + m - 1) % len + 1;
	}
}
