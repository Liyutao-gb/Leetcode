package dynamicprogram;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		String s1 = "bl";
		String s2 = "yby";
		int[][] dp = getDp(s1, s2); // ʱ�临�Ӷ�(M��N) �ռ临�Ӷ�(M��N)
		String subsequence = getSubsequence(s1, s2);
		System.out.println(subsequence);
	}

	/**
	 * 1.����һ����̬��ά����dp��
     *	�� �Ȱѵ�һ�к͵�һ��ȫ����0��������涯̬���㣻
     *	�� �ٴ�row=1��col = 1��ʼ���㣬���s1.charAt(i - 1) == s2.charAt(j - 1)��
  	 *	    ��ôdp[i][j] = dp[i - 1][j - 1] + 1������dp[i][j] =  
  	 *	  Math.max(dp[i - 1][j]��dp[i][j - 1])��
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
	 * 2.���������һ��λ�������dp[row][col] != dp[row - 1][col - 1]����ǰ�ַ���
     *	  ���ڹ����ַ�������֮�����dp[row - 1][col] >= dp[row][col - 1]��row--��
     *	  ����col--��
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