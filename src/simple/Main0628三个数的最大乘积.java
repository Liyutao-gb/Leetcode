package simple;

public class Main0628三个数的最大乘积 {
	public static void main(String[] args) {

		System.out.println(new Solution628().maximumProduct(new int[] {1,2,3}));
	}
}

class Solution628 {
	public int maximumProduct(int[] nums) {
		int[] max = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
		int[] min = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
		for (int i = 0; i < nums.length; i++) {
			//找到最大三个整数,包括重复的
			if (nums[i] > max[0]) {
				max[2] = max[1];
				max[1] = max[0];
				max[0] = nums[i];
			} else if (nums[i] > max[1] && nums[i] <= max[0]) {
				max[2] = max[1];
				max[1] = nums[i];
			} else if (nums[i] > max[2] && nums[i] <= max[1]) {
				max[2] = nums[i];
			}
			//找到最小的两个数,包括重复的
			if (nums[i] < min[0]) {
				min[1] = min[0];
				min[0] = nums[i];
			} else if (nums[i] >= min[0] && nums[i] < min[1]) {
				min[1] = nums[i];
			}
		}
//		System.out.println(max[0]+" "+max[1] +" "+max[2] +" "+min[0] +" " + min[1]);
		return Math.max(max[0] * max[1] * max[2], max[0] * min[0] * min[1]);
	}
}