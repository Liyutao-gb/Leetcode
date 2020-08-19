package simple;

public class Main0709×ª»»³ÉÐ¡Ð´×ÖÄ¸ {
	public static void main(String[] args) {

		System.out.println(new Solution709().toLowerCase("al&phaBET"));
	}
}

class Solution709 {
	public String toLowerCase(String str) {
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'A' && c[i] <= 'Z')
				c[i] = (char) (c[i] + 32);
		}
		return String.valueOf(c);
	}
}