package treesearch;

// 卡塔兰数：1 1 2 5 14 42 ……
// h(n) = h(0)*h(n-1) + h(1)*h(n-2) + ... + h(n-1)h(0) (n >= 2)
public class Main0096不同的二叉搜索树 {
	public static void main(String[] args) {
		int i = new Solution96().numTrees(3);
		System.out.println(i);
	}
}

class Solution96 {
	public int numTrees(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] += dp[j - 1] * dp[i - j];
			}
		}
		return dp[n];
	}
}

class Solution096 {
	public int numTrees(int n) {
		long C = 1;
		for (int i = 0; i < n; ++i) {
			C = C * 2 * (2 * i + 1) / (i + 2);
		}
		return (int) C;
	}
}