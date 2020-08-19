package simple;

public class Main0258各位相加 {
	public static void main(String[] args) {

		System.out.println(new Solution0258().addDigits(888));
	}
}

class Solution0258 {
	public int addDigits(int num) {
		if (num == 0)
			return num;
		return num % 9 == 0 ? 9 : num % 9;
	}
}

class Solution258 {
	public int addDigits(int num) {
		if (num <= 9) {
			return num;
		}
		int m = 0;
		while (num != 0) {
			m += num % 10;
			num /= 10;
			if (num == 0 && m >= 10) {
				num = m;
				m = 0;
			}
		}
		return m;
	}
}