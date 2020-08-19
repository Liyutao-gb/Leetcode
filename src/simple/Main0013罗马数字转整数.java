package simple;

public class Main0013罗马数字转整数 {
	public static void main(String[] args) {

		System.out.println(new Solution13().romanToInt("MCMXCIV"));
	}
}

class Solution13 {
	public int romanToInt(String s) {
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I')
				num += 1;
			else if (s.charAt(i) == 'V')
				num += 5;
			else if (s.charAt(i) == 'X')
				num += 10;
			else if (s.charAt(i) == 'L')
				num += 50;
			else if (s.charAt(i) == 'C')
				num += 100;
			else if (s.charAt(i) == 'D')
				num += 500;
			else if (s.charAt(i) == 'M')
				num += 1000;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			String s1 = s.substring(i, i + 2);
			if (s1.equals("IV"))
				num -= 2;
			else if (s1.equals("IX"))
				num -= 2;
			else if (s1.equals("XL"))
				num -= 20;
			else if (s1.equals("XC"))
				num -= 20;
			else if (s1.equals("CD"))
				num -= 200;
			else if (s1.equals("CM"))
				num -= 200;
		}
		return num;
	}
}

class Solution013 {
	public int romanToInt(String s) {
		String[] roman = { "IV", "IX", "XL", "XC", "CD", "CM", "I", "V", "X", "L", "C", "D", "M" };
		int[] nums = { 4, 9, 40, 90, 400, 900, 1, 5, 10, 50, 100, 500, 1000 };
		int num = 0;
		while (s.length() > 0) {
			for (int i = 0; i < roman.length; i++) {
				if (s.startsWith(roman[i])) {
					num += nums[i];
					s = s.substring(roman[i].length());
					break;
				}
			}
		}
		return num;
	}
}