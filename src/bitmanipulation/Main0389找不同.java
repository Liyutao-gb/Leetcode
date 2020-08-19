package bitmanipulation;

public class Main0389’“≤ªÕ¨ {
	public static void main(String[] args) {

		System.out.println(new Solution0389().findTheDifference("abcd", "abcde"));
	}
}

class Solution0389 {
	public char findTheDifference(String s, String t) {
		int result = 0;
		for (char c : s.toCharArray())
			result = result ^ c;
		for (char c : t.toCharArray())
			result = result ^ c;
		return (char) result;
	}
}

class Solution389 {
	public char findTheDifference(String s, String t) {
		int[] letter = new int[26];
		for (int i : s.toCharArray())
			letter[i - 'a']++;
		for (int i : t.toCharArray())
			letter[i - 'a']--;
		for (int i = 0; i < letter.length; i++) {
			if (letter[i] == -1)
				return (char) (i + 'a');
		}
		return 0;
	}
}