package simple;

public class Main0806写字符串需要的行数 {
	public static void main(String[] args) {

		int[] is = new Solution806().numberOfLines(new int[] { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, "bbbcccdddaaa");
		for (int i : is) {
			System.out.println(i);
		}
	}
}

class Solution806 {
	public int[] numberOfLines(int[] widths, String S) {
		int[] res = { 1, 0 };
		for (int i = 0; i < S.length(); i++) {
			res[1] += widths[S.charAt(i) - 'a'];
			if (res[1] > 100) {
				res[0]++;
				res[1] = widths[S.charAt(i) - 'a'];
			}
		}
		return res;
	}
}