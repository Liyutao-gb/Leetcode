package simple;
import java.util.Arrays;

public class Main0506相对名次 {
	public static void main(String[] args) {

		String[] s = new Solution506().findRelativeRanks(new int[]{10,3,8,9,6});
		for (int i = 0; i < s.length; i++) { 					 // 3 6 8 9 10			 
			System.out.println(s[i]); 							 // 5 4 3 2 1
		}
	}
}

class Solution506 {
	public String[] findRelativeRanks(int[] nums) {
		int[] copyNums = Arrays.copyOf(nums, nums.length);
		Arrays.sort(copyNums);
		String[] ans = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int res = Arrays.binarySearch(copyNums, nums[i]);
			if (res == nums.length - 1) {
				ans[i] = "Gold Medal";
			} else if (res == nums.length - 2) {
				ans[i] = "Silver Medal";
			} else if (res == nums.length - 3) {
				ans[i] = "Bronze Medal";
			} else {
				ans[i] = "" + (nums.length - res);
			}
		}
		return ans;
	}
}