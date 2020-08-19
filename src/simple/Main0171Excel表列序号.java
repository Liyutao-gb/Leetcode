package simple;

public class Main0171Excel±Ì¡––Ú∫≈ {
	public static void main(String[] args) {

		System.out.println(new Solution171().titleToNumber("AA")); // 27
	}
}

class Solution171 {
	public int titleToNumber(String s) {
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i) - 'A' + 1;
			ans = ans * 26 + num;
		}
		return ans;
	}
}