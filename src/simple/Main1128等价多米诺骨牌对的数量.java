package simple;
////1 <= dominoes[i][j] <= 9

public class Main1128等价多米诺骨牌对的数量 {
	public static void main(String[] args) {

		System.out.println(
				new Solution1128().numEquivDominoPairs(new int[][] { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } }));
	}
}

class Solution1128 {
	public int numEquivDominoPairs(int[][] d) {
		int ans = 0;
		int[] count = new int[100];
		for (int i = 0; i < d.length; ++i) {
			int n1 = d[i][0];
			int n2 = d[i][1];
			count[Math.max(n1, n2) * 10 + Math.min(n1, n2)]++;
		}
		for (int i = 1; i < 100; i++) {
			if (count[i] > 1)
				ans += count[i] * (count[i] - 1) / 2;
		}
		return ans;
	}
}