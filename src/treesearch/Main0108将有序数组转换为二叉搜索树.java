package treesearch;

import tree.TreeNode;

public class Main0108将有序数组转换为二叉搜索树 {
	public static void main(String[] args) {

	}
}

// 数组长度为偶数个有两种情况
class Solution108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		return sortedArrayToBST(nums, 0, nums.length);
	}

	public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
		if (start == end)
			return null;
		int mid = start + (end - start) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = sortedArrayToBST(nums, start, mid);
		node.right = sortedArrayToBST(nums, mid + 1, end);
		return node;
	}
}

class Solution0108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}

	public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
		if (start > end)
			return null;
		int mid = start + (end - start) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = sortedArrayToBST(nums, start, mid - 1);
		node.right = sortedArrayToBST(nums, mid + 1, end);
		return node;
	}
}