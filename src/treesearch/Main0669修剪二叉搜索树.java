package treesearch;

import tree.TreeNode;
// 669�޼������������� 700�����������е�������701�����������еĲ���
public class Main0669�޼����������� {
	public static void main(String[] args) {
		
	}
}

class Solution669 {
	public TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null)
			return null;
		// ɾ��������Ҫ��Ľڵ�
		if (root.val > R)
			return trimBST(root.left, L, R);
		if (root.val < L)
			return trimBST(root.right, L, R);

		// ���������Ľڵ�
		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);
		return root;
	}
}