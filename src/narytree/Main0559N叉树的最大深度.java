package narytree;

import java.util.List;

public class Main0559N叉树的最大深度 {
	public static void main(String[] args) {

	}
}

class Solution559 {
	public int maxDepth(Node root) {
		if (root == null)
			return 0;
		int max = 0;
		for (Node node : root.children) {
			max = Math.max(max, maxDepth(node));
		}
		return max + 1;
	}
}

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(List<Node> children, int val) {
		this.children = children;
		this.val = val;
	}
};