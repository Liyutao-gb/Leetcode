package simple;

public class Main0387字符串中的第一个唯一字符 {
	public static void main(String[] args) {

		System.out.println(new Solution387().firstUniqChar("loveleetcode"));
	}
}

class Solution387 {
	public int firstUniqChar(String s) {
		int[] arr = new int[26];
		for (char c : s.toCharArray()) {
			arr[c - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i) - 'a'] == 1)
				return i;
		}
		return -1;
	}
}

class Solution0387 {
	public int firstUniqChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return i;
			}
		}
		return -1;
	}
}