package simple;

public class Main0485最大连续1的个数 {
	public static void main(String[] args) {

		System.out.println(new Solution485().findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }));
	}
}

class Solution485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		int sum = 0;
		int maxLength = 0;
		for (int i : nums) {
			if (i == 1) {
				sum += 1;
			} else {
				sum = 0;
			}
			maxLength = Math.max(maxLength, sum);
		}
		return maxLength;
	}
}