package bitmanipulation;

public class Main0136SingerNumber {
	public static void main(String[] args) {
		System.out.println(new Solution0136().singleNumber(new int[] { 4, 1, 2, 1, 2 }));
	}
}

class Solution0136 {
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int i : nums)
			result ^= i;
		return result;
	}
}
