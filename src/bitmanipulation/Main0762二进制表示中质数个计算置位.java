package bitmanipulation;

public class Main0762二进制表示中质数个计算置位 {
	public static void main(String[] args) {

		System.out.println(new Solution0762().countPrimeSetBits(10, 15));
	}
}

class Solution0762 {
	public int countPrimeSetBits(int L, int R) {
		int[] isPrimeNumber = new int[] { 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0,
				0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0,0, 0, 0, 1, 0, 1, 0 };
		int count = 0;
		while (L <= R) {
			count += isPrimeNumber[Integer.bitCount(L)];
			L++;
		}
		return count;
	}
}

class Solution762 {
	public int countPrimeSetBits(int L, int R) {
		int count = 0;
		for (int n = L; n <= R; n++) {
			if (isPrimeNumber(Integer.bitCount(n)))
				count++;
		}
		return count;
	}

	public static boolean isPrimeNumber(int num) {
		if (num == 2)
			return true;
		if (num < 2 || num % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}