package treesearch;

import tree.TreeNode;

public class Main0701�����������еĲ������ {
	public static void main(String[] args) {

	}
}

class Solution701 {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null)
			return new TreeNode(val);

		if (root.val > val) {
			root.left = insertIntoBST(root.left, val);
		} else {
			root.right = insertIntoBST(root.right, val);
		}
		return root;
	}
}