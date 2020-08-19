package simple;

import java.util.HashSet;
import java.util.Set;

public class Main0804Î¨Ò»Ä¦¶ûË¹ÃÜÂë´Ê {
	public static void main(String[] args) {

		System.out.println(new Solution804().uniqueMorseRepresentations(new String[] { "gin", "zen", "gig", "msg" }));
	}
}

class Solution804 {
	public int uniqueMorseRepresentations(String[] words) {
		String[] passWord = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		Set<String> set = new HashSet<>();
		for (String word : words) {
			StringBuffer str = new StringBuffer();
			for (int j = 0; j < word.length(); j++) {
				str.append(passWord[word.charAt(j) - 'a']);
			}
			set.add(str.toString());
		}
		return set.size();
	}
}