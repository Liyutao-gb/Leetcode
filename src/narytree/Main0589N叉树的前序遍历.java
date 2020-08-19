package narytree;

import java.util.ArrayList;
import java.util.List;

public class Main0589N²æÊ÷µÄÇ°Ðò±éÀú {
	public static void main(String[] args) {

	}
}

class Solution589 {
	public List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<>();
		preorder(root, list);
		return list;
	}

	public void preorder(Node root, List<Integer> list) {
		if (root == null)
			return;
		list.add(root.val);
		for (Node node : root.children) {
			preorder(node, list);
		}
	}
}