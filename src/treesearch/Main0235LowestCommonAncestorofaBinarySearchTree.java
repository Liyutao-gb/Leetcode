package treesearch;

import tree.TreeNode;

public class Main0235LowestCommonAncestorofaBinarySearchTree {
	public static void main(String[] args) {

	}
}

class Solution235 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return root;
		if (p.val > root.val && q.val > root.val) {
			return lowestCommonAncestor(root.right, p, q);
		} else if (p.val < root.val && q.val < root.val) {
			return lowestCommonAncestor(root.left, p, q);
		} else {
			return root;
		}
	}
}