package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Main0077×éºÏ {
	public static void main(String[] args) {
		List<List<Integer>> list = new Solution77().combine(4, 2);
		for (List<Integer> list2 : list) {
			System.out.println(list2);
		}
	}
}

class Solution77 {
	int n;
	int k;
	List<List<Integer>> output = new ArrayList<>();

	public List<List<Integer>> combine(int n, int k) {
		this.n = n;
		this.k = k;
		backtrack(1, new ArrayList<>());
		return output;
	}

	public void backtrack(int i, List<Integer> tmp) {
		if (tmp.size() == k)
			output.add(new ArrayList<>(tmp));

		for (int j = i; j <= n; j++) {
			tmp.add(j);
			backtrack(j + 1, tmp);
			tmp.remove(tmp.size() - 1);
		}
	}
}