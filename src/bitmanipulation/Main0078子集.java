package bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class Main0078�Ӽ� {
	public static void main(String[] args) {

		List<List<Integer>> list = new Solution78().subsets(new int[] { 1, 2, 3 });
		System.out.println(list);
	}
}

class Solution78 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		int bit_nums = nums.length;
		int ans_nums = 1 << bit_nums; // ִ�� 2 �� n �η�
		for (int i = 0; i < ans_nums; i++) {
			List<Integer> tmp = new ArrayList<>();
			int count = 0; // ��ǰ��Ӧ�������һλ
			int i_copy = i; 
			while (i_copy != 0) {
				if ((i_copy & 1) == 1) { // �жϵ�ǰλ�Ƿ��� 1
					tmp.add(nums[count]);
				}
				count++;
				i_copy >>= 1;// ����һλ
			}
			ans.add(tmp);

		}
		return ans;
	}
}