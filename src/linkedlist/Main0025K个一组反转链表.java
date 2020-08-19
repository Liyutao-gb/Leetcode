package linkedlist;

// 25K个一组翻转链表
public class Main0025K个一组反转链表 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(5);
		head.next = node;
		node.next = node1;
		node1.next = node2;
		node2.next = node3;
		ListNode reverse = new Solution25().reverseKGroup(head, 3);
		while (reverse != null) {
			System.out.print(reverse.val + " ");
			reverse = reverse.next;
		}
	}
}

// 头结点0 	  1 -> 2 -> 3 		-> 4   k=3
// 	pre 	tail 	   end 	  newNext
class Solution25 {
	public ListNode reverseKGroup(ListNode head, int k) {
		if(head == null  || k < 1)
			return head;
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode end = dummy;
		while (end != null) {
			 // 不足K个节点反转
//			for (int i = 0; i < k && cur.next != null; i++) {
//				cur = cur.next;
//			}
//			if(cur.next == null){
//				pre.next = reverse(pre.next);
//				break;
//			}
			
			// 不足K个节点不反转
			for (int i = 0; i < k && end != null; i++) {
				end = end.next;
			}
			if(end == null){
				break;				
			}
			ListNode tail = pre.next;
			ListNode newNext = end.next;
			end.next = null;
			pre.next = reverse(tail);
			tail.next = newNext;
			pre = tail;
			end = tail;
		}
		return dummy.next;
	}
	
	public ListNode reverse(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			ListNode newNext = head.next;
			head.next = pre;
			pre = head;
			head = newNext;
		}
		return pre;
	}
}