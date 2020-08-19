package simple;

public class Main0748×î¶ÌÍêÕû´Ê {
	public static void main(String[] args) {

		System.out.println(new Solution748().shortestCompletingWord("1s3 PSt",
				new String[] { "step", "steps", "stripe", "stepple" }));
	}
}

class Solution748 {
	public String shortestCompletingWord(String licensePlate, String[] words) {
		int[] letter = new int[26];
		for (char c : licensePlate.toLowerCase().toCharArray()) {
			if (c >= 'a' && c <= 'z')
				letter[c - 'a']++;
		}
		String res = "";
		int minLength = Integer.MAX_VALUE;
		loop: for (int i = 0; i < words.length; i++) {
			int[] letter2 = new int[26];
			for (int j = 0; j < words[i].length(); j++) {
				letter2[words[i].charAt(j) - 'a']++;
			}
			for (int j = 0; j < letter.length; j++) {
				if (letter[j] != 0 && letter[j] > letter2[j]) {
					continue loop;
				}
			}
			if (words[i].length() < minLength) {
				minLength = words[i].length();
				res = words[i];
			}
		}
		return res;
	}
}