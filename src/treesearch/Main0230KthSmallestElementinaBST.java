package treesearch;

import java.util.ArrayList;
import java.util.List;

import tree.TreeNode;

public class Main0230KthSmallestElementinaBST {
	public static void main(String[] args) {

	}
}

class Solution230 {
	public int kthSmallest(TreeNode root, int k) {
		List<TreeNode> list = new ArrayList<>();
		inorder(root, list);
		return list.get(k - 1).val;
	}

	public void inorder(TreeNode root, List<TreeNode> list) {
		if (root == null)
			return;
		inorder(root.left, list);
		list.add(root);
		inorder(root.right, list);
	}
}