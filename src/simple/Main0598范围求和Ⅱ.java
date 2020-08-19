package simple;

public class Main0598��Χ��͢� {
	public static void main(String[] args) {

		int[][] ops = new int[][] { { 2, 2 }, { 3, 3 } };
		System.out.println(new Solution598().maxCount(3, 3, ops));
	}
}

//�̰�ЧӦ
class Solution598 {
	public int maxCount(int m, int n, int[][] ops) {
		for (int[] op : ops) {
			m = Math.min(m, op[0]);
			n = Math.min(n, op[1]);
		}
		return m * n;
	}
}