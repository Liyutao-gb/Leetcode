package bitmanipulation;

public class Main0268È±Ê§Êý×Ö {
	public static void main(String[] args) {
		System.out.println(new Solution268().missingNumber(new int[] { 0, 2, 3, 4 }));
	}
}

class Solution268 {
	public int missingNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i <= nums.length; i++)
			res ^= i;
		for (int i : nums)
			res ^= i;
		return res;
	}
}

class Solution0268 {
	public int missingNumber(int[] nums) {
		int sum = 0;
		for (int num : nums)
			sum += num;
		return ((1 + nums.length) * nums.length) / 2 - sum;
	}
}