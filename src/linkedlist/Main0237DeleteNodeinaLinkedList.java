package linkedlist;

public class Main0237DeleteNodeinaLinkedList {
	public static void main(String[] args) {

	}
}

// 最后一个节点无法删除,本质上并没删除节点,只是改变了结点的值,工程上不推荐
class Solution237 {
	public void deleteNode(ListNode node) {
		if (node == null)
			return;
		ListNode next = node.next;
		if (next == null) {
			throw new RuntimeException("can not remove last node");
		}
		node.val = next.val;
		node.next = next.next;
	}
}