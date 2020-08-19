package bitmanipulation;

public class Main0338比特位计算 {
	public static void main(String[] args) {

		int[] bits = new Solution338().countBits(10);
		for (int i : bits) {
			System.out.print(i + " ");
		}
	}
}

class Solution338 {
	public int[] countBits(int num) {
		int[] dp = new int[num + 1];
		dp[0] = 0;

		// P(x) = P(x / 2) + (x mod 2) 
		for (int i = 1; i <= num; i++)
			dp[i] = dp[i >> 1] + (i & 1);// x / 2 is x >> 1 and x % 2 is x & 1

		// P(x) = P(x & (x - 1)) + 1
//		for (int i = 1; i <= num; i++)
//		 	dp[i] = dp[i & (i - 1)] + 1;
		return dp;
	}
}