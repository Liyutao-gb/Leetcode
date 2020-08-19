package treesearch;

import java.util.Stack;

import tree.TreeNode;

public class Main0099»Ö¸´¶þ²æËÑË÷Ê÷ {
	public static void main(String[] args) {
		
	}
}

class Solution99 {
	TreeNode first = null;
	TreeNode second = null;
	TreeNode pre = null;

	public void recoverTree(TreeNode root) {
		inorderTraversal(root);
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}

	public void inorderTraversal(TreeNode root) {
		if (root == null)
			return;
		inorderTraversal(root.left);
		if (pre != null) {
			if (first == null && pre.val > root.val)
				first = pre;
			if (first != null && pre.val > root.val)
				second = root;
		}
		pre = root;
		inorderTraversal(root.right);
	}
}

class Solution099 {
	TreeNode first = null;
	TreeNode second = null;

	public void recoverTree(TreeNode root) {
		inorderTraversal(root);
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}

	public void inorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode pre = null;
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if (pre != null) {
				if (first == null && pre.val > root.val)
					first = pre;
				if (first != null && pre.val > root.val)
					second = root;
			}
			pre = root;
			root = root.right;
		}
	}
}