package dynamicprogram;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		String s1 = "bl";
		String s2 = "yby";
		int[][] dp = getDp(s1, s2); // 时间复杂度(M×N) 空间复杂度(M或N)
		String subsequence = getSubsequence(s1, s2);
		System.out.println(subsequence);
	}

	/**
	 * 1.构造一个动态二维数组dp。
     *	① 先把第一行和第一列全部置0，方便后面动态计算；
     *	② 再从row=1，col = 1开始计算，如果s1.charAt(i - 1) == s2.charAt(j - 1)，
  	 *	    那么dp[i][j] = dp[i - 1][j - 1] + 1；否则，dp[i][j] =  
  	 *	  Math.max(dp[i - 1][j]，dp[i][j - 1])；
	 */
	public static int[][] getDp(String s1, String s2) {
		int rows = s1.length() + 1;
		int cols = s2.length() + 1;
		int[][] dp = new int[rows][cols];

		for (int i = 0; i < rows; i++)
			dp[i][0] = 0;
		for (int i = 0; i < cols; i++)
			dp[0][i] = 0;

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp;
	}

	/**
	 * 2.从数组最后一个位置起，如果dp[row][col] != dp[row - 1][col - 1]，当前字符串
     *	  属于公共字符串；反之，如果dp[row - 1][col] >= dp[row][col - 1]，row--，
     *	  否则col--。
	 */
	public static String getSubsequence(String s1, String s2) {
		int[][] dp = getDp(s1, s2);
		StringBuffer res = new StringBuffer();
		int row = dp.length - 1;
		int col = dp[0].length - 1;

		while (row >= 1 && col >= 1) {
			if (dp[row][col] != dp[row - 1][col - 1]) {
				res.append(s1.charAt(row - 1));
				row--;
				col--;
			} else if (dp[row - 1][col] >= dp[row][col - 1]) {
				row--;
			} else {
				col--;
			}
		}
		return res.reverse().toString();
	}
}