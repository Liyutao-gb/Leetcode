package simple;

public class Main0520检测大写字母 {
	public static void main(String[] args) {

		System.out.println(new Solution520().detectCapitalUse("FlaG"));
	}
}

class Solution0520 {
	public boolean detectCapitalUse(String word) {
		int c1 = 0, c2 = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) - 'a' >= 0) {
				c1++;
			} else {
				c2++;
			}
		}
		if (c1 == word.length() || c2 == word.length()) {
			return true;
		}
		return c2 == 1 && word.charAt(0) <= 'Z';// Goolge
	}
}

class Solution520 {
	public boolean detectCapitalUse(String word) {
		if (word.length() == 1)
			return true;
		if (word.charAt(0) <= 'Z') {// 第一位大写
			if (word.charAt(1) <= 'Z') {// 第二位大写
				for (int i = 2; i < word.length(); i++) {
					if (word.charAt(i) >= 'a')
						return false;
				}
			} else {// 第二位小写
				for (int i = 2; i < word.length(); i++) {
					if (word.charAt(i) <= 'Z')
						return false;
				}
			}
		} else { // 第一位小写
			for (int i = 1; i < word.length(); i++) {
				if (word.charAt(i) <= 'Z')
					return false;
			}
		}
		return true;
	}
}