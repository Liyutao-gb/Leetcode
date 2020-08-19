package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main0015����֮�� {
	public static void main(String[] args) {
		List<List<Integer>> list = new Solution15().threeSum(new int[]{-1,0,1,2,-1,-4});
		for (List<Integer> list2 : list) {
			System.out.println(list2);
		}
	}
}

class Solution15 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		int len = nums.length;
		if (nums == null || len < 3)
			return ans;
		
		Arrays.sort(nums);
		for (int i = 0; i < len; i++) {
			if (nums[i] > 0)
				break; // �����ǰ���ִ���0��������֮��һ������0�����Խ���ѭ��
			if (i > 0 && nums[i] == nums[i - 1])
				continue; // ȥ��
			int L = i + 1;
			int R = len - 1;
			while (L < R) {
				int sum = nums[i] + nums[L] + nums[R];
				if (sum == 0) {
					ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
					while (L < R && nums[L] == nums[L + 1])
						L++; // ȥ��
					while (L < R && nums[R] == nums[R - 1])
						R--; // ȥ��
					L++;
					R--;
				} else if (sum < 0)
					L++;
				else if (sum > 0)
					R--;
			}
		}
		return ans;
	}
}