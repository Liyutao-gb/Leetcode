package simple;

public class Main0680验证回文字符串Ⅱ {
	public static void main(String[] args) {

		System.out.println(new Solution680().validPalindrome("abca"));
	}
}

class Solution680 {
	public boolean validPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;// "abca"
		while (left < right) {// 结束条件：left=right的时候
			// 左右两边的字符不相等的时候，选择跳过左边或者右边的一个字符
			if (s.charAt(left) != s.charAt(right)) {
				return isPalindrome(s, left, right - 1) || isPalindrome(s, left + 1, right);
			}
			left++;
			right--;
		}
		return true;
	}

	private boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
}