package binarysearch;

public class Main0441≈≈¡–”≤±“ {
	public static void main(String[] args) {

		System.out.println(new Solution441().arrangeCoins(8));
	}
}

class Solution0441 {
	public int arrangeCoins(int n) {
		int left = 1, right = n;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			Long sum =  1L * mid * (mid + 1) / 2;
			if (sum > n)
				right = mid - 1;
			else if (sum < n)
				left = mid + 1;
			else if (sum == n)
				return mid;
		}
		return left - 1;
	}
}

class Solution441 {
	public int arrangeCoins(int n) {
		int i = 1;
		while (n >= i) {
			n -= i;
			i++;
		}
		return i - 1;
	}
}