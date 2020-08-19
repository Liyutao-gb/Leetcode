package binarysearch;

public class Main0367有效的完全平方数 {
	public static void main(String[] args) {

		System.out.println(new Solution0367().isPerfectSquare(808201));
	}
}

class Solution0367 {
	public boolean isPerfectSquare(int num) {
		long first = 1, last = (num + 1) / 2;
		while (first <= last) {
			Long mid = (Long) (first + (last - first) / 2);
			if (mid * mid == num)
				return true;
			else if (mid * mid > num)
				last = mid - 1;
			else
				first = mid + 1;
		}
		return false;
	}
}

class Solution367 {
	public boolean isPerfectSquare(int num) {
		int subNum = 1;
		while (num > 0) {
			num -= subNum;
			subNum += 2;
		}
		return num == 0;
	}
}