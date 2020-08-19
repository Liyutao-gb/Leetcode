package simple;

public class Main0459ÖØ¸´µÄ×Ó×Ö·û´® {
	public static void main(String[] args) {

		System.out.println(new Solution459().repeatedSubstringPattern("abab"));
	}
}

class Solution0459 {
	public boolean repeatedSubstringPattern(String s) {
		int len = s.length();
		for (int i = len / 2; i >= 1; i--) {
			if (len % i == 0) {
				boolean pass = true;
				String h = s.substring(0, i);
				for (int j = len / i; j > 1; j--) {
					if (!h.equals(s.substring(i * (j - 1), i * j))) {
						pass = false;
						break;
					}
				}
				if (pass) {
					return true;
				}
			}
		}
		return false;
	}
}

class Solution459 {
	public boolean repeatedSubstringPattern(String s) {
		return s.matches("(\\w+)\\1+");
	}
}