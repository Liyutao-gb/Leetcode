package simple;

public class Main0908×îÐ¡²îÖµ¢ñ {
	public static void main(String[] args) {

		System.out.println(new Solution908().smallestRangeI(new int[] { 1 }, 1));
	}
}

class Solution908 {
	public int smallestRangeI(int[] A, int K) {
		int min = A[0], max = A[0];
		for (int x : A) {
			min = Math.min(min, x);
			max = Math.max(max, x);
		}
		return Math.max(0, max - min - 2 * K);
	}
}