package dynamicprogram;

public class Main0055JumpGame {
	public static void main(String[] args) {
		System.out.println(new Solution55().canJump(new int[] { 2, 3, 1, 1, 4 }));
	}
}
class Solution55 {
	public boolean canJump(int[] nums) {
		int position = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > position)	// 说明跳不到当前i的位置
				return false;
			position = Math.max(position, nums[i] + i);
		}
		return true;
	}
}
