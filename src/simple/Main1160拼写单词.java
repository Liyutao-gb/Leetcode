package simple;

import java.util.Arrays;

public class Main1160Æ´Ð´µ¥´Ê {
	public static void main(String[] args) {

		System.out.println(
				new Solution1160().countCharacters(new String[] { "hello", "world", "leetcode" }, "welldonehoneyr"));
	}
}

class Solution1160 {
	public int countCharacters(String[] words, String chars) {
		int[] letter = new int[26];
		for (int i : chars.toCharArray())
			letter[i - 'a']++;

		int length = 0;
		for (int i = 0; i < words.length; i++) {
			int[] copy = Arrays.copyOf(letter, letter.length);
			int j;
			for (j = 0; j < words[i].length(); j++) {
				if (copy[words[i].charAt(j) - 'a'] > 0)
					copy[words[i].charAt(j) - 'a']--;
				else
					break;
			}
			if (j == words[i].length())
				length += words[i].length();
		}
		return length;
	}
}