package simple;

import java.util.HashMap;
import java.util.Map;

public class Main0219´æÔÚÖØ¸´ÔªËØ¢ò {
	public static void main(String[] args) {

		System.out.println(new Solution219().containsNearbyDuplicate(new int[] { 99, 99 }, 2));
	}
}

class Solution0219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k){
				return true;
			}
			map.put(nums[i], i);
		}
		return false;
	}
}

class Solution219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && j - i <= k)
					return true;
			}
		}
		return false;
	}
}