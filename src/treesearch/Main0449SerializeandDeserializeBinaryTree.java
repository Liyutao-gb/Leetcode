package treesearch;

import java.util.LinkedList;
import java.util.Queue;

import tree.TreeNode;

public class Main0449SerializeandDeserializeBinaryTree {
	public static void main(String[] args) {
		// ǰ�����л�
		TreeNode node = new Codec().deserialize("1,2,#,#,3,#,#");
		// ���л�
		String string = new Codec().serialize(node);
		System.out.println("ǰ�����л���" + string);
	}
}

class Codec {

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if (root == null)
			return "#,";
		String res = root.val + ",";
		res += serialize(root.left);
		res += serialize(root.right);
		return res;
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		String[] val = data.split(",");
		Queue<String> queue = new LinkedList<>();
		for (int i = 0; i < val.length; i++) {
			queue.add(val[i]);
		}
		return reconPreOrder(queue);
	}

	public TreeNode reconPreOrder(Queue<String> queue) {
		String val = queue.poll();
		if (val.equals("#"))
			return null;
		TreeNode node = new TreeNode(Integer.parseInt(val));
		node.left = reconPreOrder(queue);
		node.right = reconPreOrder(queue);
		return node;
	}
}