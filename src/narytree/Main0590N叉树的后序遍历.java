package narytree;

import java.util.ArrayList;
import java.util.List;

public class Main0590N²æÊ÷µÄºóÐò±éÀú {
	public static void main(String[] args) {

	}
}

class Solution590 {
	public List<Integer> postorder(Node root) {
		List<Integer> list = new ArrayList<>();
		postorder(root, list);
		return list;
	}

	public void postorder(Node root, List<Integer> list) {
		if (root == null)
			return;
		for (Node node : root.children) {
			postorder(node, list);
		}
		list.add(root.val);
	}
}