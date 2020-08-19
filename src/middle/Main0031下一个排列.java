package middle;

public class Main0031下一个排列 {
	public static void main(String[] args) {
		int[] a = new int[] {9,8,4,7,6,5,2};
		new Solution31().nextPermutation(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}

class Solution31 {
	public void nextPermutation(int[] nums) {
		int index1 = -1, index2 = -1;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {
				index1 = i - 1;
				index2 = i;
				break;
			}
		}
		if (index1 == -1) {
			int start = 0, end = nums.length - 1;
			while (start < end) {
				int temp = nums[start];
				nums[start++] = nums[end];
				nums[end--] = temp;
			}
			return;
		}
		for (int i = index2; i < nums.length; i++) {
			if (nums[i] > nums[index1])
				index2 = i;
		}
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
		int start = index1 + 1, end = nums.length - 1;
		while (start < end) {
			int tem = nums[start];
			nums[start++] = nums[end];
			nums[end--] = tem;
		}
	}
}