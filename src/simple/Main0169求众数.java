package simple;

public class Main0169ÇóÖÚÊı {
	public static void main(String[] args) {

		System.out.println(new Solution169().majorityElement(new int[] { 2, 2, 1, 1, 1 }));
	}
}

class Solution169 {
	public int majorityElement(int[] nums) {
		int num = nums[0], count = 0;
		for (int i : nums) {
			if (count == 0) {
				num = i;
				count = 1;
			} else if (i == num) {
				count++;
			} else {
				count--;
			}
		}
		return num;
	}
}