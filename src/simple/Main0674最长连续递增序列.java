package simple;

public class Main0674最长连续递增序列 {
	public static void main(String[] args) {

		System.out.println(new Solution674().findLengthOfLCIS(new int[] { 1, 3, 5, 4, 7 }));
	}
}

class Solution674 {
	public int findLengthOfLCIS(int[] nums) {
		if (nums.length == 0 || nums.length == 1)
			return nums.length;
		int max = 0, sum = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] > nums[i]) {
				sum++;
			} else {
				sum = 1;
			}
			max = Math.max(max, sum);
		}
		return max;
	}
}