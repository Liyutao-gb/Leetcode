package dynamicprogram;

public class Main0062UniquePaths {
	public static void main(String[] args) {
		System.out.println(new Solution62().uniquePaths(7, 3));
	}
}

// 空间复杂度：O(m+n)
class Solution62 {
	public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
		
		for (int i = 0; i < n; i++)
			dp[0][i] = 1;
		for (int i = 0; i < m; i++)
			dp[i][0] = 1;

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		return dp[m - 1][n - 1];
    }
}

// 空间复杂度：O(n)
class Solution062 {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < dp.length; i++)
			dp[i] = 1;
        
        for (int i = 1; i < m;i++){
            for (int j = 1; j < n; j++){
                dp[j] = dp[j] + dp[j-1]; // 上 + 左
            }
        }
        return dp[n-1];
    }
}