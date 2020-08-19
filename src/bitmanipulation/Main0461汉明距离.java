package bitmanipulation;

public class Main0461ººÃ÷¾àÀë {
	public static void main(String[] args) {

		System.out.println(new Solution0461().hammingDistance(1, 4));
	}
}

class Solution0461 {
	public int hammingDistance(int x, int y) {
		int xor = x ^ y;
		int count = 0;
		while(xor != 0){
			xor = xor & (xor - 1);
			count++;
		}
		return count;
	}
}

class Solution461 {
	public int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}
}