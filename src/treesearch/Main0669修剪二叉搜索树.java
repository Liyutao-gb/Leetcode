package treesearch;

import tree.TreeNode;
// 669修剪二叉搜索树、 700二叉搜索树中的搜索、701二叉搜索树中的插入
public class Main0669修剪二叉搜索树 {
	public static void main(String[] args) {
		
	}
}

class Solution669 {
	public TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null)
			return null;
		// 删除不满足要求的节点
		if (root.val > R)
			return trimBST(root.left, L, R);
		if (root.val < L)
			return trimBST(root.right, L, R);

		// 处理正常的节点
		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);
		return root;
	}
}