package dynamicprogram;

public class LongestCommonSubstring {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "bebcd";
		String lcst1 = lcst1(s1, s2);// 时间复杂度(m×n) 空间复杂度(m+n)
		String lcst2 = lcst2(s1, s2);// 时间复杂度(m×n) 空间复杂度(1)
		System.out.println("lcst1:" + lcst1);
		System.out.println("lcst2:" + lcst2);
	}

	/**
	 * 方法一:
	 * 1.先构造一个动态二维数组dp。
   	 * 	 ①第一行和第一列，如果对应字符串相等，那么dp[i][j] = 1；
     * 	 ②再从row = 1，col = 1开始计算，如果s1.charAt(i) == s2.charAt(j)，
  	 *	    那么dp[i][j] = dp[i - 1][j - 1] + 1；否则默认0。
	 */
	// 1. 构造一个动态dp
	public static int[][] getDp(String s1, String s2) {
		int rows = s1.length();
		int cols = s2.length();
		int[][] dp = new int[rows][cols];

		for (int i = 0; i < rows; i++)
			if (s1.charAt(i) == s2.charAt(0))
				dp[i][0] = 1;
		for (int i = 0; i < cols; i++)
			if (s1.charAt(0) == s2.charAt(i))
				dp[0][i] = 1;

		// 字符相等：左上角的值 + 1，否则默认0
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (s1.charAt(i) == s2.charAt(j))
					dp[i][j] = dp[i - 1][j - 1] + 1;
			}
		}
		return dp;
	}

	/**
	 * 2.遍历二维数组找到最大值（最大长度），记录最大值所在行，最后截取字符串
     *	  返回字符串。
	 */
	public static String lcst1(String s1, String s2) {
		int[][] dp = getDp(s1, s2);
		int max = 0, index = 0;
		
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				if (dp[i][j] > max) {
					max = dp[i][j];
					index = i;
				}
			}
		}
		return s1.substring(index - max + 1, index + 1);
	}

	/**
	 * 方法二
	 */
	public static String lcst2(String s1, String s2) {
		int max = 0; // 最大长度的值
		int index = 0; // 最大长度的下标
		int row = 0; // 第一行开始
		int col = s2.length() - 1;// 最后一列开始
		while (row < s1.length()) {
			int i = row;
			int j = col;
			int len = 0;
			while (i < s1.length() && j < s2.length()) {
				if (s1.charAt(i) != s2.charAt(j)) {
					len = 0;
				} else {
					len++;
				}
				if (len > max) {
					max = len;
					index = i;
				}
				i++;
				j++;
			}
			if (col > 0) // 斜线开始的位置先向左移动
				col--;
			else // 列移动到第一列，行向下移动
				row++;
		}
		return s1.substring(index - max + 1, index + 1);
	}
}