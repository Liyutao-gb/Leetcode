package simple;

public class Main0867×ªÖÃ¾ØÕó {
	public static void main(String[] args) {

		int[][] is = new Solution867().transpose(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
		for (int[] is2 : is) {
			for (int i : is2) {
				System.out.println(i);
			}
			System.out.println();
		}
	}
}

class Solution867 {
	public int[][] transpose(int[][] A) {
		int[][] res = new int[A[0].length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				res[j][i] = A[i][j];
			}
		}
		return res;
	}
}