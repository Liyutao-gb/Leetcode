package bitmanipulation;

public class Main0342PowerofFour {
	public static void main(String[] args) {
		System.out.println(new Solution342().isPowerOfFour(4));
	}
}

class Solution342 {
	public boolean isPowerOfFour(int num) {
		return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) == num;
	}
}