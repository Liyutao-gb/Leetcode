package dynamicprogram;

public class Main0746使用最小花费爬楼梯 {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 1 };
		System.out.println(new Solution746().minCostClimbingStairs(arr));
	}
}

class Solution746 {
	public int minCostClimbingStairs(int[] cost) {
		int[] dp = new int[cost.length];
		dp[0] = cost[0];
		dp[1] = cost[1];
		for (int i = 2; i < cost.length; i++) {
			dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
		}
		return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
	}
}