package simple;

public class Main0747至少是其他数字两倍的最大数 {
	public static void main(String[] args) {

		System.out.println(new Solution747().dominantIndex(new int[] { 0, 0, 2, 1 }));
	}
}

class Solution747 {
	public int dominantIndex(int[] nums) {
		int maxPos = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[maxPos] < nums[i])
				maxPos = i;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] * 2 > nums[maxPos] && i != maxPos)
				return -1;
		}
		return maxPos;
	}
}