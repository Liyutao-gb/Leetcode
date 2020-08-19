package simple;

public class Main0066¼ÓÒ» {
	public static void main(String[] args) {

		int[] a = new Solution66().plusOne(new int[] { 1, 2, 8 });
		for (int i : a) {
			System.out.print(i);
		}
	}
}

class Solution66 {
	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i]++;
			digits[i] = digits[i] % 10;
			if (digits[i] != 0)
				return digits;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
}