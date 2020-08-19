package stack;

public class Main1021É¾³ý×îÍâ²ãµÄÀ¨ºÅ {
	public static void main(String[] args) {
		System.out.println(new Solution1021().removeOuterParentheses("(()())(())(()(()))"));
	}
}

class Solution1021 {
	public String removeOuterParentheses(String S) {
		StringBuffer res = new StringBuffer();
		char[] c = S.toCharArray();
		
		int count = 0;
		for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                if (count > 0)
                    res.append(c[i]);
                count++;
            } else {
                count--;
                if (count > 0)
                    res.append(c[i]);
            }
		}
		return res.toString();
	}
}