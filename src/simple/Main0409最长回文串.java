package simple;

public class Main0409最长回文串 {
	public static void main(String[] args) {

		System.out.println(new Solution0409().longestPalindrome("abccccdd"));
	}
}

class Solution0409 {
	public int longestPalindrome(String s) {
		int[] arr = new int[123];
		for (int i : s.toCharArray())
			arr[i]++;
		int count = 0;
		for (int i : arr)
			count += i / 2 * 2;
		return s.length() == count ? count : count + 1;
	}
}

class Solution409 {
	public int longestPalindrome(String s) {
		int[] arr = new int[256];
		for (int i : s.toCharArray()) {
			arr[i]++;
		}
		int count = 0;
		for (int i : arr) {
			if (i % 2 == 0 && i != 0) {
				count += i;
			} else if (i % 2 != 0 && i != 1) {
				count += i - 1;
			}
		}
		return s.length() > count ? count + 1 : count;
	}
}