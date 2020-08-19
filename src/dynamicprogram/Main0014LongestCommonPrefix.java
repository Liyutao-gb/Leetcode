package dynamicprogram;

public class Main0014LongestCommonPrefix {
	public static void main(String[] args) {
		String[] str = { "flo", "flower", "fl" };
		System.out.println(new Solution14().longestCommonPrefix(str));
	}
}

class Solution14 {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		int len = Integer.MAX_VALUE;
		for (String s : strs)
			len = Math.min(len, s.length());

		StringBuffer res = new StringBuffer();
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < strs.length; j++) {
				if (strs[0].charAt(i) != strs[j].charAt(i))
					return res.toString();
			}
			res.append(strs[0].charAt(i));
		}
		return res.toString();
	}
}

class Solution014 {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		String pre = strs[0];
		int i = 1;
		while (i < strs.length) {
			while (strs[i].indexOf(pre) != 0) { // 字符串String的indexOf方法使用
				pre = pre.substring(0, pre.length() - 1);
			}
			i++;
		}
		return pre;
	}
}