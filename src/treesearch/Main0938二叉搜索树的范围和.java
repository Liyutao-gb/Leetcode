package treesearch;

import tree.TreeNode;

public class Main0938¶þ²æËÑË÷Ê÷µÄ·¶Î§ºÍ {
	public static void main(String[] args) {

	}
}

class Solution938 {
	int sum = 0;

	public int rangeSumBST(TreeNode root, int L, int R) {
		getSum(root, L, R);
		return sum;
	}

	public void getSum(TreeNode node, int L, int R) {
		if (node == null)
			return;

		getSum(node.left, L, R);
		if (node.val >= L && node.val <= R)
			sum += node.val;
		getSum(node.right, L, R);
	}
}