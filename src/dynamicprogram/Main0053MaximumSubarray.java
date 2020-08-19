package dynamicprogram;

public class Main0053MaximumSubarray {
	public static void main(String[] args) {
		System.out.println(new Solution53().maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}
}

class Solution53 {
	public int maxSubArray(int[] nums) {
		int sum = 0;
		int ans = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (sum > 0)
				sum += nums[i];
			else
				sum = nums[i];
			ans = Math.max(ans, sum);
		}
		return ans;
	}
}