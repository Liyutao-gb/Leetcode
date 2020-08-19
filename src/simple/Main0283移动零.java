package simple;

public class Main0283“∆∂Ø¡„ {
	public static void main(String[] args) {

		int[] a = new int[] { 0, 1, 0, 3, 12 };
		new Solution283().moveZeroes(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
}

class Solution0283 {
	public void moveZeroes(int[] nums) {
		int slow = 0;
		int fast = 0;
		while (fast < nums.length) {
			if (nums[fast] == 0) {
				fast++;
			} else {
				int temp = nums[fast];
				nums[fast] = nums[slow];
				nums[slow] = temp;
				slow++;
				fast++;
			}
		}
	}
}

class Solution283 {
	public void moveZeroes(int[] nums) {
		int m = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[m++] = nums[i];
			}
		}
		for (int i = m; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
}