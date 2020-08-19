package simple;

public class Main0414第三大的数 {
	public static void main(String[] args) {

		System.out.println(new Solution414().thirdMax(new int[] { 1, 2 }));
	}
}

class Solution414 {
	public int thirdMax(int[] nums) {
		long first = Long.MIN_VALUE;
		long second = Long.MIN_VALUE;
		long third = Long.MIN_VALUE;
		for (long num : nums) {
			if (num > first) {
				third = second;
				second = first;
				first = num;
			} else if (num > second && num < first) {
				third = second;
				second = num;
			} else if (num > third && num < second) {
				third = num;
			}
		}
		if (third == Long.MIN_VALUE ) { // 3,3,3  3,2,2
			return (int) first;
		} else {
			return (int) third;
		}
	}
}