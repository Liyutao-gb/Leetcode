package dynamicprogram;

public class LongestCommonSubstring {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "bebcd";
		String lcst1 = lcst1(s1, s2);// ʱ�临�Ӷ�(m��n) �ռ临�Ӷ�(m+n)
		String lcst2 = lcst2(s1, s2);// ʱ�临�Ӷ�(m��n) �ռ临�Ӷ�(1)
		System.out.println("lcst1:" + lcst1);
		System.out.println("lcst2:" + lcst2);
	}

	/**
	 * ����һ:
	 * 1.�ȹ���һ����̬��ά����dp��
   	 * 	 �ٵ�һ�к͵�һ�У������Ӧ�ַ�����ȣ���ôdp[i][j] = 1��
     * 	 ���ٴ�row = 1��col = 1��ʼ���㣬���s1.charAt(i) == s2.charAt(j)��
  	 *	    ��ôdp[i][j] = dp[i - 1][j - 1] + 1������Ĭ��0��
	 */
	// 1. ����һ����̬dp
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

		// �ַ���ȣ����Ͻǵ�ֵ + 1������Ĭ��0
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (s1.charAt(i) == s2.charAt(j))
					dp[i][j] = dp[i - 1][j - 1] + 1;
			}
		}
		return dp;
	}

	/**
	 * 2.������ά�����ҵ����ֵ����󳤶ȣ�����¼���ֵ�����У�����ȡ�ַ���
     *	  �����ַ�����
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
	 * ������
	 */
	public static String lcst2(String s1, String s2) {
		int max = 0; // ��󳤶ȵ�ֵ
		int index = 0; // ��󳤶ȵ��±�
		int row = 0; // ��һ�п�ʼ
		int col = s2.length() - 1;// ���һ�п�ʼ
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
			if (col > 0) // б�߿�ʼ��λ���������ƶ�
				col--;
			else // ���ƶ�����һ�У��������ƶ�
				row++;
		}
		return s1.substring(index - max + 1, index + 1);
	}
}