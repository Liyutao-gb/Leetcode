package simple;

public class Main1150���һ�����Ƿ���������ռ������� {
	public static void main(String[] args) {

		System.out.println(new Solution1150().isMajorityElement(new int[] { 1, 10, 101, 101 }, 101));
	}
}

class Solution1150 {
	public boolean isMajorityElement(int[] nums, int target) {
		int count = 0;
		for (int i : nums) {
			if (i == target)
				count++;
		}
		return count > nums.length / 2;
	}
}