package treesearch;

import tree.TreeNode;
// 530二叉搜索树的最小绝对差、783二叉搜索树节点最小距离
public class Main0530二叉搜索树的最小绝对差 {
	public static void main(String[] args) {

	}
}

// 任意两节点的差的最小值
class Solution530 {
	int res = Integer.MAX_VALUE;
	TreeNode pre = null; // 记录上一次结点的辅助指针

	public int getMinimumDifference(TreeNode root) {
		if (root == null)
			return 0;
		helper(root);
		return res;
	}

	public void helper(TreeNode root) {
		if (root == null)
			return;
		helper(root.left);
		if (pre != null)
			res = Math.min(res, root.val - pre.val);
		pre = root;
		helper(root.right);
	}
}