package simple;

public class Main0832·­×ªÍ¼Ïñ {
	public static void main(String[] args) {

		int[][] is = new Solution832().flipAndInvertImage(new int[][] { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } });
		for (int[] is2 : is) {
			for (int i : is2) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

class Solution832 {
	public int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			int start = 0, end = A[i].length - 1;
			while (start < end) {
				if (A[i][start] != A[i][end]) {
					start++;
					end--;
				} else {
					A[i][start] = A[i][start] == 1 ? 0 : 1;
					A[i][end] = A[i][end] == 1 ? 0 : 1;
					start++;
					end--;
				}
			}
			if (start == end) {
				A[i][start] = A[i][start] == 1 ? 0 : 1;
			}
		}
		return A;
	}
}