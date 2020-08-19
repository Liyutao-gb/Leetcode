package simple;

public class Main0500¼üÅÌÐÐ {
	public static void main(String[] args) {

		String[] s = new Solution500().findWords(new String[] { "Hello", "Alaska", "Dad", "Peace" });
		for (String string : s) {
			System.out.println(string);
		}
	}
}

class Solution500 {
	public String[] findWords(String[] words) {
		if (words.length == 0)
			return new String[] {};
		String s = "";
		char[] a = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		char[] b = { 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l' };
		char[] c = { 'z', 'x', 'c', 'v', 'b', 'n', 'm' };
		for (int i = 0; i < words.length; i++) {
			String s1 = words[i].toLowerCase();
			int a1 = 0, b1 = 0, c1 = 0;
			for (int j = 0; j < words[i].length(); j++) {
				for (char d : a) {
					if (s1.charAt(j) == d)
						a1++;
				}
				for (char d : b) {
					if (s1.charAt(j) == d)
						b1++;
				}
				for (char d : c) {
					if (s1.charAt(j) == d)
						c1++;
				}
				if (a1 == s1.length() || b1 == s1.length() || c1 == s1.length())
					s += words[i] + " ";
			}
		}
		if (s.length() == 0)
			return new String[] {};
		return s.split(" ");
	}
}