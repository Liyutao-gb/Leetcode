package simple;

import java.util.Arrays;

public class Main0561Êý×é²ð·Ö¢ñ {
	public static void main(String[] args) {

		System.out.println(new Solution561().arrayPairSum(new int[] { 1, 4, 3, 2 }));
	}
}

class Solution561 {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}
		return sum;
	}
}