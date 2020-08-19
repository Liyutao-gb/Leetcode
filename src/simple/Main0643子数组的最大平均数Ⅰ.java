package simple;

public class Main0643子数组的最大平均数Ⅰ {
	public static void main(String[] args) {

		System.out.println(new Solution643().findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4));
	}
}

class Solution643 {
	public double findMaxAverage(int[] nums, int k) {
		double maxSum = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		maxSum = sum;
		for (int i = k; i < nums.length; i++) {
			sum = sum - nums[i - k] + nums[i];
			maxSum = Math.max(sum, maxSum);
		}
		return maxSum / k;
	}
}