package middle;

public class Main0004寻找两个有序数组的中位数 {
	public static void main(String[] args) {

		System.out.println(new Solution4().findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
	}
}

class Solution4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] merge = new int[nums1.length + nums2.length];

		int index1 = 0, index2 = 0, m = 0;
		while (index1 < nums1.length && index2 < nums2.length)
			merge[m++] = nums1[index1] < nums2[index2] ? nums1[index1++] : nums2[index2++];
		while (index1 < nums1.length)
			merge[m++] = nums1[index1++];
		while (index2 < nums2.length)
			merge[m++] = nums2[index2++];

		int median = nums1.length + nums2.length;
		if ((median & 1) == 1)
			return merge[median / 2];
		return (merge[median / 2] + merge[median / 2 - 1]) / 2.0;
	}
}