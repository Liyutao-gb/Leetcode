package simple;

public class Main0824É½ÑòÀ­¶¡ÎÄ {
	public static void main(String[] args) {

		System.out.println(new Solution824().toGoatLatin("I speak Goat Latin"));
	}
}

class Solution824 {
	public String toGoatLatin(String S) {
		StringBuffer str = new StringBuffer();
		String[] split = S.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (isVaild(split[i])) {
				str.append(split[i] + "ma");
			} else {
				str.append(split[i].substring(1) + split[i].charAt(0) + "ma");
			}
			for (int j = 0; j <= i; j++)
				str.append("a");
			str.append(" ");
		}
		return str.toString().trim();
	}

	public boolean isVaild(String str) {
		return str.charAt(0) == 'a' || str.charAt(0) == 'o' || str.charAt(0) == 'e' || str.charAt(0) == 'i'
				|| str.charAt(0) == 'u' || str.charAt(0) == 'a' || str.charAt(0) == 'A' || str.charAt(0) == 'O'
				|| str.charAt(0) == 'E' || str.charAt(0) == 'I' || str.charAt(0) == 'U';
	}
}