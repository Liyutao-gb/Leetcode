package simple;

import java.util.Arrays;

public class Main0242有效的字母异位词 {
	public static void main(String[] args) {

		System.out.println(new Solution242().isAnagram("anagram", "nagaram"));
	}
}

class Solution0242 {
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		int[] sLetter = new int[26];
		for (int i = 0; i < s.length(); i++) {
			sLetter[s.charAt(i) - 'a']++;
			sLetter[t.charAt(i) - 'a']--;
		}
		for (int i : sLetter) {
			if(i != 0)
				return false;
		}
		return true;
	}
}

class Solution242 {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		return Arrays.equals(s1, t1);
	}
}