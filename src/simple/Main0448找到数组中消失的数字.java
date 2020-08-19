package simple;

import java.util.ArrayList;
import java.util.List;

public class Main0448找到数组中消失的数字 {
	public static void main(String[] args) {

		System.out.println(new Solution448().findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
	}
}

class Solution448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i : nums)
			arr[i - 1]++;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				list.add(i + 1);
		}
		return list;
	}
}