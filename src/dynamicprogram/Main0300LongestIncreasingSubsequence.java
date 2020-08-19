package dynamicprogram;

import java.util.Arrays;

public class Main0300LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 3, 6, 4, 8, 9, 7 };
		int[] lis = new Solution300().lengthOfLIS(arr);
		System.out.println(Arrays.toString(lis));
	}
}

class Solution300 {
	public int[] lengthOfLIS(int[] nums) {
		int[] dp = new int[nums.length];

		int len = 0;
		for (int i = 0; i < dp.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j])
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}
			len = Math.max(len, dp[i]);
		}
		
		// 返回最长递增子序列
		int[] result = new int[len];
		for (int i = dp.length - 1; i >= 0; i--) {
			if (dp[i] == len) {
				len--;
				result[len] = nums[i];
			}
		}
		return result;
	}
}

class Solution0300 {
	public int lengthOfLIS(int[] nums) {
		if (nums.length == 0)
			return 0;
		int[] ends = new int[nums.length];
		ends[0] = nums[0];
		int right = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int l = 0;
			int r = right;
			while (l <= r) {
				int m = (l + r) / 2;
				if (nums[i] > ends[m]) {
					l = m + 1;
				} else {
					r = m - 1;
				}
			}
			right = Math.max(right, l);
			ends[l] = nums[i];
			max = Math.max(max, l + 1);
		}
		return max;
	}
}