package simple;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main0217´æÔÚÖØ¸´ÔªËØ {
	public static void main(String[] args) {

		System.out.println(new Solution217().containsDuplicate(new int[] { 1, 2, 3, 1 }));
	}
}

class Solution0217 {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			if (set.contains(i)) {
				return true;
			}
			set.add(i);
		}
		return false;
	}
}

class Solution217 {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				return true;
			}
		}
		return false;
	}
}