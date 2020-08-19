package treesearch;

import java.util.Stack;
import tree.TreeNode;

public class Main0098ValidateBinarySearchTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(3);
		root.left = node1;
		root.right = node2;
		boolean b = new Solution98().isValidBST(root);
		System.out.println(b);
	}
}

class Solution98 {
	public boolean isValidBST(TreeNode root) {
		return helper(root, null, null);
	}

	public boolean helper(TreeNode root, Integer low, Integer high) {
		if (root == null)
			return true;
		if (low != null && root.val <= low)	// <=
			return false;
		if (high != null && root.val >= high)
			return false;
		return helper(root.left, low, root.val) && helper(root.right, root.val, high);
	}
}

// ÖÐÐò±éÀú
class Solution098 {
	public boolean isVaildBST(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode pre = null;
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if (pre != null && root.val <= pre.val)
				return false;
			pre = root;
			pre.val = root.val;
			root = root.right;
		}
		return true;
	}
}