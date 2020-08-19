package simple;

public class Main0028实现strStr {
	public static void main(String[] args) {

		System.out.println(new Solution28().strStr("a", "a"));
	}
}

class Solution28 {
	public int strStr(String haystack, String needle) {
		if(needle.equals(""))
			return 0;
		if(haystack.equals(""))
			return -1;
		
		int[] next = kmpNext(needle);
		int index = kmpSearch(haystack, needle, next);
		return index;
	}

	public static int kmpSearch(String haystack, String needle, int[] next) {
		for (int i = 0, j = 0; i < haystack.length(); i++) {
			// KMP算法核心
			while (j > 0 && haystack.charAt(i) != needle.charAt(j))
				j = next[j - 1];
			
			if (haystack.charAt(i) == needle.charAt(j))
				j++;
			if (j == needle.length())
				return i - j + 1;
		}
		return -1;
	}

	public static int[] kmpNext(String needle) {
		int[] next = new int[needle.length()];
		next[0] = 0;
		for (int i = 1, j = 0; i < needle.length(); i++) {
			// KMP算法核心
			while (j > 0 && needle.charAt(i) != needle.charAt(j))
				j = next[j - 1];
			
			if (needle.charAt(i) == needle.charAt(j))
				j++;
			next[i] = j;
		}
		return next;
	}
}