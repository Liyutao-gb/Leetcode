package simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main0532数组中的Kdiff数对 {
	public static void main(String[] args) {
		
		System.out.println(new Solution532().findPairs(new int[]{3,1,4,1,5}, 2));
	}
}

class Solution0532 {
	public int findPairs(int[] nums, int k) {
		if (nums.length < 2)
			return 0;
		int res = 0;
		Arrays.sort(nums);
		int i = 0, j = 0;
		while (i < nums.length) {
			j = Math.max(j, i + 1);
			while (j < nums.length && nums[j] - nums[i] < k)
				j++;
			if (j < nums.length && nums[j] - nums[i] == k)
				res++;
			while (i < nums.length - 1 && nums[i + 1] == nums[i])
				i++;
			i++;
		}
		return res;
	}
}

class Solution532 {
	public int findPairs(int[] nums, int k) { 
		if (k < 0)
			return 0;
		Arrays.sort(nums);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) { 
				if (nums[j] - nums[i] == k) {
					map.put(nums[i],nums[j]);
				}
			}
		}
		return map.size();
	}
}