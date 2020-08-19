package simple;

public class Main0665非递减数列 {
	public static void main(String[] args) {

		System.out.println(new Solution665().checkPossibility(new int[] { 2, 3, 3, 2, 4 }));
		//2,3,3,2,4 true		3,4,2,3 false
	}
}

class Solution665 {
	public boolean checkPossibility(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {//可能i+1位置是要变化的数
				if (i >= 1 && i < nums.length - 2) {
					if(nums[i + 1] < nums[i - 1] && nums[i + 2] < nums[i]){
						return false;							
					}
				}
				count++;
			}
		}
		return count == 1 || count == 0;
	}
}