package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Main0022À¨ºÅµÄÉú³É {
	public static void main(String[] args) {
		List<String> list = new Solution22().generateParenthesis(3);
		for (String s : list) {
			System.out.println(s);
		}
	}
}

class Solution22 {
	public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<>();
		backtrack(ans, "", 0, 0, n);
		return ans;
	}

	public void backtrack(List<String> ans, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			ans.add(cur);
			return;
		}

		if (open < max)
			backtrack(ans, cur + "(", open + 1, close, max);
		if (close < open)
			backtrack(ans, cur + ")", open, close + 1, max);
	}
}