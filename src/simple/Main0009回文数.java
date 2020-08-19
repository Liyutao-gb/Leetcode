package simple;

public class Main0009»ØÎÄÊı {
	public static void main(String[] args) {

		System.out.println(new Solution9().isPalindrome(121));
	}
}

class Solution9 {
	public boolean isPalindrome(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0))
			return false;
		
		int rev = 0;
		while (x > rev) {
			rev = rev * 10 + x % 10;
			x /= 10;
		}
		return x == rev || x == rev / 10;
	}
}