package simple;

public class Main0027ÒÆ³ıÔªËØ {
	public static void main(String[] args) {

		System.out.println(new Solution27().removeElement(new int[] { 0,1,2,2,3,0,4,2 }, 2));
	}
}

class Solution27 {
	public int removeElement(int[] nums, int val) {
		int m = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val)
				nums[m++] = nums[i];
		}
		return m;
	}
}