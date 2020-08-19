package treesearch;

import tree.TreeNode;

class Solution0897 {
	TreeNode pre = null;

	public TreeNode increasingBST(TreeNode root) {
		TreeNode node = new TreeNode(0);
		pre = node;
		preOrder(root);
		return node.right;
	}

	public void preOrder(TreeNode root) {
		if (root == null)
			return;
		preOrder(root.left);
		root.left = null; // ×¢£ºKey
		pre.right = root;
		pre = root;
		preOrder(root.right);
	}
}