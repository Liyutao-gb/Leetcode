package simple;

import java.util.HashSet;
import java.util.Set;

public class Main0645´íÎóµÄ¼¯ºÏ {
	public static void main(String[] args) {

		int[] arr = new Solution0645().findErrorNums(new int[] { 1, 2, 2, 4 });
		for (int i : arr) {
			System.out.println(i);
		}
	}
}

class Solution0645 {
	public int[] findErrorNums(int[] nums) {
		int[] arr = new int[nums.length];
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i] - 1]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				res[1] = i + 1;
			} else if (arr[i] == 2) {
				res[0] = i + 1;
			}
		}
		return res;
	}
}

class Solution645 {
	public int[] findErrorNums(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int num1 = 0;
		for (int num : nums) {
			if (set.contains(num)) {
				num1 = num;
			} else {
				set.add(num);
			}
		}
		int num2 = 0;
		for (int i = 1; i <= nums.length; i++) {
			num2 = i ^ num2;
		}
		for (int num : set) {
			num2 = num2 ^ num;
		}
		return new int[] { num1, num2 };
	}
}