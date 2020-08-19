package simple;

public class Main0088合并两个有序数组 {
	public static void main(String[] args) {

		int[] a = new int[] { 3, 4, 7, 0, 0, 0 };
		new Solution88().merge(a, 3, new int[] { 2, 5, 6 }, 3);
		for (int i : a) {
			System.out.println(i);
		}
	}
}

class Solution88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		int p = nums1.length - 1;
		while (p1 >= 0 && p2 >= 0) {
			nums1[p--] = nums1[p1] <= nums2[p2] ? nums2[p2--] : nums1[p1--];
		}
		while (p2 >= 0) {
			nums1[p--] = nums2[p2--];
		}
		// System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
	}
}