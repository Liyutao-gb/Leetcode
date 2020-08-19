package treesearch;

import tree.TreeNode;
// 530��������������С���Բ783�����������ڵ���С����
public class Main0530��������������С���Բ� {
	public static void main(String[] args) {

	}
}

// �������ڵ�Ĳ����Сֵ
class Solution530 {
	int res = Integer.MAX_VALUE;
	TreeNode pre = null; // ��¼��һ�ν��ĸ���ָ��

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