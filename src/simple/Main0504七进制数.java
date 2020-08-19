package simple;

public class Main0504Æß½øÖÆÊı {
	public static void main(String[] args) {

		System.out.println(new Solution504().convertToBase7(100));
	}
}

class Solution504 {
	public String convertToBase7(int num) {
		if (num == 0)
			return "0";
		StringBuffer str = new StringBuffer();
		int num1 = Math.abs(num);
		while (num1 > 0) {
			str.append(num1 % 7);
			num1 /= 7;
		}
		if (num < 0) {	
			return str.append("-").reverse().toString();
		}
		return str.reverse().toString();
	}
}