package binarysearch;

public class Main0069x的平方根 {
	public static void main(String[] args) {

		System.out.println(new Solution69().mySqrt(8));
	}
}

class Solution69 {
	public int mySqrt(int x) {
		int left = 1, right = x;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if(x / mid == mid)
				return mid;
			else if(x / mid > mid)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return right;
	}
}