package dynamicprogram;

import java.util.Arrays;

public class Main0322CoinChange {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 11 };
		int amount = 15;
		System.out.println(new Solution322().coinChange(arr, amount));
	}
}

class Solution322 {
	public int coinChange(int[] coins, int amount) {
		int max = amount + 1;
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, max);

		dp[0] = 0; // 0 ÎÞ·¨¶Ò»»³ö
		for (int i = 1; i < dp.length; i++) {
			for (int coin : coins) {
				if (i >= coin)
					dp[i] = Math.min(dp[i], dp[i - coin] + 1);
			}
		}

		return dp[amount] == max ? -1 : dp[amount];
	}
}