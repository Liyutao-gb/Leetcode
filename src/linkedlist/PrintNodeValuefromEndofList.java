package linkedlist;

import java.util.Stack;

public class PrintNodeValuefromEndofList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		System.out.print("µÝ¹é£º");
		print(head);
		System.out.print("\nµü´ú£º");
		printList(head);
	}
	
	public static void print(ListNode head) {
		if(head == null)
			return;
		print(head.next);
		System.out.print(head.val +" ");
	}
	
	public static void printList(ListNode head) {
		if(head == null)
			return;
		
		Stack<ListNode> stack = new Stack<>();
		ListNode cur = head;
		while (cur != null) {
			stack.push(cur);
			cur = cur.next;
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop().val + " ");
		}
	}
}
