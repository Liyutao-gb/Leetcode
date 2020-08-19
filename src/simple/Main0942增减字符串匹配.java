package simple;

public class Main0942Ôö¼õ×Ö·û´®Æ¥Åä {
	public static void main(String[] args) {

		int[] is = new Solution942().diStringMatch("IDID");
		for (int i : is) {
			System.out.print(i + " ");
		}
	}
}

class Solution942 {
	public int[] diStringMatch(String S) {
		int[] ans = new int[S.length() + 1];
		char[] c = S.toCharArray();

		int start = 0, end = c.length;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'I')
				ans[i] = start++;
			else
				ans[i] = end--;
		}
		ans[ans.length - 1] = c[c.length - 1] == 'I' ? start : end;

		return ans;
	}
}