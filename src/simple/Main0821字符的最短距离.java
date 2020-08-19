package simple;

public class Main0821×Ö·ûµÄ×î¶Ì¾àÀë {
	public static void main(String[] args) {

		int[] is = new Solution821().shortestToChar("loveleetcode", 'e');
		for (int i : is) {
			System.out.print(i + " ");
		}
	}
}

class Solution821 {
	public int[] shortestToChar(String S, char C) {
		int[] ans = new int[S.length()];
		int pre = -S.length(); // chars before first C, ans[i] >= n
		// pass 1, left to right, distance
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != C) {
				ans[i] = i - pre;
			} else {
				pre = i;
			}
		}
		// pass 2, right to left, shortest distance
		for (int i = pre - 1; i >= 0; i--) {
			if (S.charAt(i) != C) {
				ans[i] = Math.min(ans[i], pre - i);
			} else {
				pre = i;
			}
		}
		return ans;
	}
}