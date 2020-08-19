package binarysearch;

public class Main0852山脉数组的峰顶索引 {
	public static void main(String[] args) {

		System.out.println(new Solution852().peakIndexInMountainArray(new int[] { 0, 2, 1, 0 }));
	}
}

class Solution852 {
	public int peakIndexInMountainArray(int[] A) {
		if (A.length < 3)
			return -1;
		
		int low = 0, high = A.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
				return mid;
			} else if (A[mid] > A[mid - 1] && A[mid] < A[mid + 1]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}