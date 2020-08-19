package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Main0046È«ÅÅÁĞ {
	public static void main(String[] args) {
		List<List<Integer>> list = new Solution46().permute(new int[] { 1, 2, 3 });
		for (List<Integer> list2 : list) {
			System.out.println(list2);
		}
	}
}

class Solution46 {
	List<List<Integer>> list = new ArrayList<>();

	public List<List<Integer>> permute(int[] nums) {
		int[] visited = new int[nums.length];
		backtrack(nums, visited, new ArrayList<>());
		return list;
	}

	public void backtrack(int[] nums, int[] visited, List<Integer> tmp) {
		if (tmp.size() == nums.length)
			list.add(new ArrayList<>(tmp));

		for (int i = 0; i < nums.length; i++) {
			if (visited[i] == 1)
				continue;
			tmp.add(nums[i]);
			visited[i] = 1;
			backtrack(nums, visited, tmp);
			visited[i] = 0;
			tmp.remove(tmp.size() - 1);
		}
	}
}