package linkedlist;

public class Main0237DeleteNodeinaLinkedList {
	public static void main(String[] args) {

	}
}

// ���һ���ڵ��޷�ɾ��,�����ϲ�ûɾ���ڵ�,ֻ�Ǹı��˽���ֵ,�����ϲ��Ƽ�
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