package simple;

public class Main0026ɾ�����������е��ظ��� {
	public static void main(String[] args) {

		System.out.println(new Solution26().removeDuplicates(new int[] { 0, 0, 1, 2, 3, 3, 4 }));
	}
}

class Solution26 {
	public int removeDuplicates(int[] nums) {
		int m = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1])
				nums[m++] = nums[i];
		}
		return m;
	}
}