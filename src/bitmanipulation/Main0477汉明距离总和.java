package bitmanipulation;

public class Main0477ººÃ÷¾àÀë×ÜºÍ {
	public static void main(String[] args) {

		System.out.println(new Solution477().totalHammingDistance(new int[] { 4, 14, 2 }));
	}
}

class Solution477 {
	public int totalHammingDistance(int[] nums) {
		int result = 0;
		for (int i = 0; i < 32; i++) {
			int oneBit = 0;
			for (int j = 0; j < nums.length; j++) {
				oneBit += (nums[j] >> i) & 1;
			}
			result += oneBit * (nums.length - oneBit);
		}
		return result;
	}
}
