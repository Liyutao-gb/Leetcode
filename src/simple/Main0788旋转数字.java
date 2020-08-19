package simple;

public class Main0788旋转数字 {
	public static void main(String[] args) {

		System.out.println(new Solution788().rotatedDigits(857));
	}
}

class Solution788 {
	public int rotatedDigits(int N) {
		int count = 0;
		int n = 1;
		while (n <= N) {
			if (isHao(n)) {
				count++;
			}
			n++;
		}
		return count;
	}

	public boolean isHao(int n) {
		int count = 0;
		while (n != 0) {
			int temp = n % 10;
			if (temp == 3 || temp == 4 || temp == 7) {// 不能带 3 4 7
				return false;
			}
			if (temp == 2 || temp == 5 || temp == 6 || temp == 9) {// 至少有一个2 5 6 9
				count++;
			}
			n /= 10;
		}
		return count >= 1;
	}
}