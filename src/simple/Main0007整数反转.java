package simple;

public class Main0007整数反转 {
	public static void main(String[] args) {

		System.out.println(new Solution07().reverse(-2147483412));
	}
}

class Solution007 {
	public int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;
			rev = rev * 10 + pop;
		}
		return rev;
	}
}

class Solution07 {
	public int reverse(int x) {
		if (x == 0)
			return 0;
		StringBuilder s = new StringBuilder();
		char[] num1 = "2147483647".toCharArray();
		char[] num2 = "2147483648".toCharArray();

		int num = x < 0 ? -x : x;
		while (num != 0) {
			s.append(num % 10);
			num /= 10;
		}
		if (s.length() > 10)
			return 0;

		if (s.length() == 10) {
			if (x > 0) {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) - '0' > num1[i] - '0')
						return 0;
					else if (s.charAt(i) - '0' < num1[i] - '0')
						break;
				}
			} else {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) - '0' > num2[i] - '0')
						return 0;
					else if (s.charAt(i) - '0' < num2[i] - '0')
						break;
				}
			}
		}
		return x < 0 ? Integer.parseInt("-" + s.toString()) : Integer.parseInt(s.toString());
	}
}

class Solution7 {
	public int reverse(int x) {
		long y = 0;
		while (x != 0) {
			y = y * 10 + x % 10;
			x /= 10;
		}
		if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
			return 0;
		return (int) y;
	}
}