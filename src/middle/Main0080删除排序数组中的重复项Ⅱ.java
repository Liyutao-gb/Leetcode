package middle;

public class Main0080删除排序数组中的重复项Ⅱ {
	public static void main(String[] args) {

		System.out.println(new Solution80().removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 }));
	}
}

class Solution80 {
	public int removeDuplicates(int[] nums) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (i < 2 || nums[j] != nums[i - 2])
				nums[i++] = nums[j];
		}
		return i;
	}
}