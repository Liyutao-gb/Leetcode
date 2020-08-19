package bitmanipulation;

public class Main0693交替位二进制数 {
	public static void main(String[] args) {

		System.out.println(new Solution693().hasAlternatingBits(5));
	}
}

class Solution693 {
	public boolean hasAlternatingBits(int n) {
		int count = 0;
		int num = n ^ (n >> 1);
		while (n != 0) {
			count++;
			n >>= 1;
		}
		return Integer.bitCount(num) == count;
	}
}

class Solution0693 {
	public boolean hasAlternatingBits(int n) {
		while (n > 0) {
			int cur = n & 1;
			int next = (n >> 1) & 1;
			if (cur == next)
				return false;
			n >>= 1;
		}
		return true;
	}
}