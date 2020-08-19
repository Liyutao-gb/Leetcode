package dynamicprogram;

public class Main0045JumpGameⅡ {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 1, 4};
		System.out.println(new Solution45().jump(arr));
	}
}

// 每次在可跳范围内选择可以使得跳的更远的位置
class Solution45 {
	public int jump(int[] nums) {
		int end = 0;
		int maxPosition = 0;
		int steps = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			// 找能跳的最远的
			maxPosition = Math.max(maxPosition, nums[i] + i);
			if (i == end) { // 遇到边界，更新边界，并且步数加一
				end = maxPosition;
				steps++;
			}
		}
		return steps;
	}
}