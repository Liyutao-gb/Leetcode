package stack;

public class Main0402ÒÆµôKÎ»Êý×Ö {
	public static void main(String[] args) {
		System.out.println(new Solution402().removeKdigits("1432219", 3));
	}
}

class Solution402 {
	public String removeKdigits(String num, int k) {//[i] > [i+1] ÒÆ³ý i
		if (k >= num.length())
			return "0";
		
		char[] dp = new char[num.length()];
		int index = 0;
		for (char c : num.toCharArray()) {
			while (k > 0 && index > 0 && c < dp[index - 1]) {
				k--;
				index--;
			}
			if (index != 0 || c != '0')
				dp[index++] = c;
		}
		String str = new String(dp, 0, index - k);
		return str.equals("") ? "0" : str;
	}
}