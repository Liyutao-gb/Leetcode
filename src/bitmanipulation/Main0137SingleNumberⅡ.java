package bitmanipulation;

public class Main0137SingleNumberⅡ {
	public static void main(String[] args) {
		int[] arr = { -2, -2, 1, 1, -3, 1, -3, -3, -4, -2 };
		System.out.println(new Solution137().singleNumber(arr));
	}
}

class Solution137 {
	public int singleNumber(int[] nums) {
		int[] bit = new int[32];

		for (int j = 0; j < 32; j++) { // 每一位数字对应的二进制位加起来
			for (int i = 0; i < nums.length; i++) {
				int num = nums[i] >> j;
				bit[j] += num & 1;
			}
		}
		
		int result = 0;
		for (int i = 31; i >= 0; i--) {
			result <<= 1;
			result += bit[i] % 3;
		}
		return result;
	}
}