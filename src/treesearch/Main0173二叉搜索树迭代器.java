package treesearch;

import java.util.Stack;
import tree.TreeNode;

public class Main0173¶þ²æËÑË÷Ê÷µü´úÆ÷ {
	public static void main(String[] args) {
		
	}
}

class BSTIterator {
    Stack<TreeNode> stack;

	public BSTIterator(TreeNode root) {
		stack = new Stack<>();
		while (root != null) {
			stack.push(root);
			root = root.left;
		}

	}

	/** @return the next smallest number */
	public int next() {
		TreeNode node = stack.pop();
		int result = node.val;

		if (node.right != null) {
			node = node.right;
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
		}

		return result;
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		if (stack.empty())
			return false;
		return true;
	}
}