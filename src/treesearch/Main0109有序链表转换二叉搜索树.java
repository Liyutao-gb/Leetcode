package treesearch;

import java.util.ArrayList;
import java.util.List;

import linkedlist.ListNode;
import tree.TreeNode;

public class Main0109有序链表转换二叉搜索树 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		TreeNode root = new Solution109().sortedListToBST(head);
		inorder(root);
	}

	public static void inorder(TreeNode root) {
		System.out.print(root.val + " ");
		if (root.left != null)
			inorder(root.left);
		if (root.right != null)
			inorder(root.right);
	}
}

// 偶数节点两种情况
class Solution109 {
	public TreeNode sortedListToBST(ListNode root) {
		return helper(root, null);
	}

	public TreeNode helper(ListNode head, ListNode tail) {
		if (head == tail)
			return null;
		ListNode slow = head;
		ListNode fast = head;
		while (fast != tail && fast.next != tail) {
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode node = new TreeNode(slow.val);
		node.left = helper(head, slow);
		node.right = helper(slow.next, tail);
		return node;
	}
}

class Solution0109 {
	public TreeNode sortedListToBST(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		return helper(list, 0, list.size());
	}

	private TreeNode helper(List<Integer> list, int start, int end) {
		if (start == end)
			return null;
		int mid = start + (end - start) / 2;
		TreeNode root = new TreeNode(list.get(mid));
		root.left = helper(list, start, mid);
		root.right = helper(list, mid + 1, end);
		return root;
	}
}