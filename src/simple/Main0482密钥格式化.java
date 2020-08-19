package simple;

public class Main0482ÃÜÔ¿¸ñÊ½»¯ {
	public static void main(String[] args) {

		System.out.println(new Solution482().licenseKeyFormatting("2-5g-3-J", 2));
	}
}

class Solution482 {
	public String licenseKeyFormatting(String s, int k) {
		StringBuilder sb = new StringBuilder();
		int num = 0;
		for (int i = s.length() - 1; i > -1; i--) {
			if (s.charAt(i) != '-') {
				if (num == k) {
					sb.append("-");
					num = 0;
				}
				sb.append((char) (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ? s.charAt(i) - 32 : s.charAt(i)));
				num++;
			}
		}
		return sb.reverse().toString();
	}
}