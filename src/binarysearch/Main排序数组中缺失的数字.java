package binarysearch;

//0-(n-1)递增排序数组中缺失的数字

public class Main排序数组中缺失的数字 {
	public static void main(String[] args) {

		System.out.println(num(new int[] { 0,1,2,3,4,5,6 }));
	}

	public static int num(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == mid) {
				low = mid + 1;
			} else if (mid == 0) {
				return 0;
			} else if (arr[mid - 1] == mid - 1) {
				return mid;
			} else {
				high = mid - 1;
			}
		}
		return -1;
//		return arr.length;
	}
}
