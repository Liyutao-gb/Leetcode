package bitmanipulation;

public class Main0190颠倒二进制位 {
	public static void main(String[] args) {

		System.out.println(new Solution190().reverseBits(2));
	}
}

class Solution190 {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		int res = 0;
		for (int i = 0; i < 32; i++) {
			int temp = n & 1;
			temp <<= (31 - i);
			res |= temp;
			n >>= 1;
		}
		return res;
	}
}