package linkedlist;

import java.util.HashMap;

public class Main0138复制带随机指针的链表 {
	public static void main(String[] args) {

	}
}

class Solution138 {
	HashMap<Node, Node> map = new HashMap<Node, Node>();

	public Node copyRandomList(Node head) {
		if (head == null)
			return null;
		if (map.containsKey(head))
			return map.get(head);

		Node node = new Node(head.val, null, null);
		map.put(head, node);

		node.next = copyRandomList(head.next);
		node.random = copyRandomList(head.random);
		return node;
	}
}

class Node {
	public int val;
	public Node next;
	public Node random;

	public Node() {
	}

	public Node(int _val, Node _next, Node _random) {
		val = _val;
		next = _next;
		random = _random;
	}
}