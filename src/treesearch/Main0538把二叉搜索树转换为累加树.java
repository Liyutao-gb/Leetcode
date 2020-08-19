package treesearch;

import tree.TreeNode;

public class Main0538把二叉搜索树转换为累加树 {
	public static void main(String[] args) {

	}
}

class Solution538 {
	int sum = 0;

	public TreeNode convertBST(TreeNode root) {
		helper(root);
		return root;
	}

	public void helper(TreeNode root) {
		if (root == null)
			return;
		helper(root.right);
		root.val += sum;
		sum = root.val;
		helper(root.left);
	}
}