package simple;

public class Main0724寻找数组的中心索引 {
	public static void main(String[] args) {

		System.out.println(new Solution724().pivotIndex(new int[] {2,2,1,-1,5}));
	}
}

//经典
class Solution724 {
	public int pivotIndex(int[] nums) {
		int sumTotal = 0;
		int sumLeft = 0;
		for (int i = 0; i < nums.length; i++) {
			sumTotal += nums[i];
		}
		for (int p = 0; p < nums.length; p++) {
			if (sumLeft * 2 == sumTotal - nums[p]) {
				return p;
			}
			sumLeft += nums[p];
		}
		return -1;
	}
}