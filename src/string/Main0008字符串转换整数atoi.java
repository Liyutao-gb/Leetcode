package string;

public class Main0008�ַ���ת������atoi {
	public static void main(String[] args) {
		System.out.println(new Solution8().myAtoi("0-1"));
	}
}

class Solution8 {
	public int myAtoi(String str) {
		if (str == null)
			return 0;
		str = str.trim();
		if (str.length() == 0)
			return 0;

		char firstChar = str.charAt(0);
		int sign = 1;
		int start = 0;
		long res = 0;
		if (firstChar == '+') {
			sign = 1;
			start++;
		}
		if (firstChar == '-') {
			sign = -1;
			start++;
		}

		for (int i = start; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return (int) res * sign;
			}
			res = res * 10 + str.charAt(i) - '0';
			if (sign == 1 && res > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if (sign == -1 && res > Integer.MAX_VALUE)
				return Integer.MIN_VALUE;
		}
		return (int) res * sign;
	}
}