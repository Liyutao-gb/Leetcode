package simple;

public class Main0977有序数组的平方 {
	public static void main(String[] args) {

		int[] is = new Solution977().sortedSquares(new int[] {-7,-3,2,3,11});
		for (int i : is) {
			System.out.println(i);
		}
	}
}

class Solution977 {
	public int[] sortedSquares(int[] A) {
		int left = 0, right = A.length - 1;
		int[] ans = new int[A.length];
		int rightPtr = A.length - 1;
		while (left <= right) {
			if (Math.abs(A[left]) >= A[right]) {
				ans[rightPtr] = A[left] * A[left];
				left++;
			} else {
				ans[rightPtr] = A[right] * A[right];
				right--;
			}
			rightPtr--;
		}
		return ans;
	}
}