package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Main0078×Ó¼¯ {
	public static void main(String[] args) {
		List<List<Integer>> list = new Solution78().subsets(new int[] { 1, 2, 3 });
		for (List<Integer> list2 : list) {
			System.out.println(list2);
		}
	}
}

class Solution78 {
	List<List<Integer>> list = new ArrayList<>();

	public List<List<Integer>> subsets(int[] nums) {
		backtrack(0, nums, new ArrayList<>());;
		return list;
	}

	public void backtrack(int i, int[] nums, List<Integer> tmp) {
		list.add(new ArrayList<>(tmp));
		
		for (int j = i; j < nums.length; j++) {
			tmp.add(nums[j]);
			backtrack(j + 1, nums, tmp);
			tmp.remove(tmp.size() - 1);
		}
	}
}