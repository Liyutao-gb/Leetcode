package simple;

public class Main0263³óÊý {
	public static void main(String[] args) {

		System.out.println(new Solution263().isUgly(7));
	}
}

class Solution263 {
	public boolean isUgly(int num) {
		while (num != 0) {
			if (num % 2 == 0) {
				num /= 2;
			} else if (num % 3 == 0) {
				num /= 3;
			} else if (num % 5 == 0) {
				num /= 5;
			} else {
				break;
			}
		}
		return num == 1;
	}
}