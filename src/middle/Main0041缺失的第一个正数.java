package middle;

public class Main0041缺失的第一个正数 {
	public static void main(String[] args) {

		System.out.println(new Solution41().firstMissingPositive(new int[] {3,4,-1,1}));
	}
}

class Solution41 {
	public int firstMissingPositive(int[] nums) {// while 可换 if + else{i++;}
		for (int i = 0; i < nums.length; i++) {
			while (nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
				int temp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = temp;
			}
		}
		int i = 0;
		while (i < nums.length && i + 1 == nums[i]) {
			i++;
		}
		return i + 1;
	}
}