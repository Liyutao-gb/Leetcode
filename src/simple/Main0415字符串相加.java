package simple;

public class Main0415×Ö·û´®Ïà¼Ó {
	public static void main(String[] args) {

		System.out.println(new Solution415().addStrings("999", "1"));
	}
}

class Solution415 {
	public String addStrings(String num1, String num2) {
		StringBuffer s = new StringBuffer();
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int temp = 0;
		while (i >= 0 || j >= 0) {
			if (i >= 0) {
				temp += num1.charAt(i--) - '0';
			}
			if (j >= 0) {
				temp += num2.charAt(j--) - '0';
			}
			s.append(temp % 10);
			temp /= 10;
		}
		if (temp == 1)
			s.append("1");
		return s.reverse().toString();
	}
}