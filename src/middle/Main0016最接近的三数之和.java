package middle;

import java.util.Arrays;

public class Main0016最接近的三数之和 {
	public static void main(String[] args) {

		System.out.println(new Solution16().threeSumClosest(new int[]{-1,2,1,-4}, 1));
	}
}

class Solution16 {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int ans = nums[0] + nums[1] + nums[2];
		for (int l = 0; l < nums.length - 2; l++) {
			int mid = l + 1, r = nums.length - 1;
			while (mid < r) {
				int sum = nums[l] + nums[mid] + nums[r];
				if (Math.abs(target - sum) < Math.abs(target - ans))
					ans = sum;
				if (sum > target)
					r--;
				else if (sum < target)
					mid++;
				else
					return ans;
			}
		}
		return ans;
	}
}