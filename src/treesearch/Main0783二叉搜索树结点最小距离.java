package treesearch;

import tree.TreeNode;

public class Main0783二叉搜索树结点最小距离 {
	public static void main(String[] args) {

	}
}

class Solution783 {
	TreeNode pre = null;
	int ans = Integer.MAX_VALUE;

	public int minDiffInBST(TreeNode root) {
		if (root == null)
			return 0;
		preOrder(root);
		return ans;
	}

	public void preOrder(TreeNode root) {
		if (root == null)
			return;
		preOrder(root.left);
		if (pre != null)
			ans = Math.min(ans, root.val - pre.val);
		pre = root;
		preOrder(root.right);
	}
}