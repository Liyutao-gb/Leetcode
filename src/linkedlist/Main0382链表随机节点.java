package linkedlist;

import java.util.Random;

public class Main0382链表随机节点 {
	public static void main(String[] args) {

	}
}

class Solution382 {
	private ListNode node;

	public Solution382(ListNode head) {
		node = head;
	}

	public int getRandom() {
		ListNode res = node;
		ListNode cur = node.next;
		int i = 2;
		// 从第二个节点开始,每次循环替换res的概率都是1/i
		while (cur != null) {
			Random random = new Random();
			int ran = random.nextInt(i);
			if (ran == 0) {
				res = cur;
			}
			cur = cur.next;
			i++;
		}
		return res.val;
	}
}