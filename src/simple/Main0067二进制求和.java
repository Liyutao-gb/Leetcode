package simple;

public class Main0067二进制求和 {
	public static void main(String[] args) {

		System.out.println(new Solution67().addBinary("1010", "1011"));
	}
}

class Solution67 {
	public String addBinary(String a, String b) {
		StringBuilder res = new StringBuilder();
		int aLen = a.length() - 1;
		int bLen = b.length() - 1;
		int carry = 0;
		while (aLen >= 0 || bLen >= 0) {
			int sum = carry;
			if (aLen >= 0) {
				sum += a.charAt(aLen--) - '0';
			}
			if (bLen >= 0) {
				sum += b.charAt(bLen--) - '0';
			}
			res.append(sum % 2);
			carry = sum / 2;
		}
		if (carry == 1)
			res.append(1);
		return res.reverse().toString();
	}
}