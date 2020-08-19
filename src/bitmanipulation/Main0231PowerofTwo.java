package bitmanipulation;

public class Main0231PowerofTwo {
	public static void main(String[] args) {
		System.out.println(new Solution231().isPowerOfTwo(64));
	}
}

class Solution231 {
	public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
	}
}