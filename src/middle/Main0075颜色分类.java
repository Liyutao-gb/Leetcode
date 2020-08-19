package middle;

public class Main0075—’…´∑÷¿‡ {
	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		new Solution75().sortColors(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}

class Solution75 {
	public void sortColors(int[] nums) {
		int p = 0, p1 = 0, p2 = nums.length - 1;

		while (p1 <= p2) {
			if (nums[p1] == 0) {
				int tmp = nums[p];
				nums[p++] = nums[p1];
				nums[p1++] = tmp;
			} else if (nums[p1] == 1) {
				p1++;
			} else if (nums[p1] == 2) {
				int tmp = nums[p1];
				nums[p1] = nums[p2];
				nums[p2--] = tmp;
			}
		}
	}
}