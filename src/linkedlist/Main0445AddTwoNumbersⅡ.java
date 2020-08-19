package linkedlist;

import java.util.Stack;

public class Main0445AddTwoNumbersⅡ {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		ListNode node = new ListNode(3);
		ListNode node1 = new ListNode(7);
		ListNode l2 = new ListNode(6);
		ListNode node2 = new ListNode(3);
		l1.next = node;
		node.next = node1;
		l2.next = node2;
		ListNode node3 = new Solution445().addTwoNumbers(l1, l2);
		while (node3 != null) {
			System.out.print(node3.val + " ");
			node3 = node3.next;
		}
	}
}

// 	 9 3 7 	  7 3 9
//     6 3 	  3 6
// 1 0 0 0    0 0 0 1
// 反转链表l1、反转链表l2		-----→	反转新链表
//（逆序替代了栈空间）
class Solution445 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode rev1 = reverseList(l1);
		ListNode rev2 = reverseList(l2);

		ListNode pre = null;
		ListNode res = null;
		int carry = 0;
		while (rev1 != null || rev2 != null) {
			int num1 = rev1 == null ? 0 : rev1.val;
			int num2 = rev2 == null ? 0 : rev2.val;
			carry += num1 + num2;
			pre = res;						// 保存res的前一个节点
			res = new ListNode(carry % 10); // res指向新结点
			res.next = pre;					// 指向前一个节点
			carry /= 10;
			rev1 = rev1 == null ? null : rev1.next;
			rev2 = rev2 == null ? null : rev2.next;
		}
		if (carry == 1) {
			pre = res;
			res = new ListNode(1);
			res.next = pre;
		}
		return res;
	}

	public ListNode reverseList(ListNode cur) {
		ListNode pre = null;
		while (cur != null) {
			ListNode tmp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = tmp;
		}
		return pre;
	}
}

// 栈空间替代了逆序
class Solution0445 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<ListNode> stack1 = new Stack<>();
		Stack<ListNode> stack2 = new Stack<>();
		ListNode rev1 = l1, rev2 = l2;
		while (rev1 != null) {
			stack1.push(rev1);
			rev1 = rev1.next;
		}
		while (rev2 != null) {
			stack2.push(rev2);
			rev2 = rev2.next;
		}

		ListNode pre = null;
		ListNode res = null;
		int carry = 0;
		while (!stack1.empty() || !stack2.empty()) {
			int num1 = stack1.empty() ? 0 : stack1.pop().val;
			int num2 = stack2.empty() ? 0 : stack2.pop().val;
			carry += num1 + num2;
			pre = res;						// 保存res的前一个节点
			res = new ListNode(carry % 10); // res指向新结点
			res.next = pre;					// 指向前一个节点
			carry /= 10;
			rev1 = rev1 == null ? null : rev1.next;
			rev2 = rev2 == null ? null : rev2.next;
		}
		if (carry == 1) {
			pre = res;
			res = new ListNode(1);
			res.next = pre;
		}
		return res;
	}
}