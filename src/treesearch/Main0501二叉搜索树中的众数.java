package treesearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tree.TreeNode;

public class Main0501二叉搜索树中的众数 {
	public static void main(String[] args) {

	}
}

class Solution501 {
	Map<Integer, Integer> map = new HashMap<>();

	public int[] findMode(TreeNode root) {
		inorder(root);
		List<Integer> list = new ArrayList<>();
		int max = 0;
		for (Integer val : map.values()) {
			if (val > max)
				max = val;
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max)
				list.add(entry.getKey());
		}
		int[] ans = new int[list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

	public void inorder(TreeNode root) {
		if (root == null)
			return;
		inorder(root.left);
		if (map.containsKey(root.val))
			map.put(root.val, map.get(root.val) + 1);
		else
			map.put(root.val, 1);
		inorder(root.right);
	}
}