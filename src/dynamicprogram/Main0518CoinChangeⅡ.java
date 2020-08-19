package dynamicprogram;

public class Main0518CoinChangeⅡ {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 11 };
		int amount = 15;
		System.out.println(new Solution518().change(arr, amount));
	}
}

class Solution518 {
	public int change(int[] coins, int amount) {
		int[] dp = new int[amount + 1];

		dp[0] = 1;
		for (int i = 0; i < coins.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				if (j >= coins[i])
					dp[j] += dp[j - coins[i]];
			}
//			 System.out.println("当前有" + (i + 1) + "张RMB：" + Arrays.toString(dp));
		}

		return dp[amount];
	}
}