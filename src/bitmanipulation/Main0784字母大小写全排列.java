package bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class Main0784字母大小写全排列 {
	public static void main(String[] args) {

		System.out.println(new Solution784().letterCasePermutation("a1b2"));
	}
}

class Solution784 {
	public List<String> letterCasePermutation(String S) {
		List<String> list = new ArrayList<String>();
		dg(S.toCharArray(), 0, list);
		return list;
	}

	public void dg(char[] s, int i, List<String> list) {
		if (i == s.length) {
			list.add(String.valueOf(s));
			return;
		}
		dg(s, i + 1, list);
		if (s[i] < '0' || s[i] > '9') {
			s[i] ^= (1 << 5);
			dg(s, i + 1, list);
		}
	}
}