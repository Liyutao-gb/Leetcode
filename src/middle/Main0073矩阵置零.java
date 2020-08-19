package middle;

import java.util.Arrays;

public class Main0073æÿ’Û÷√¡„ {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		new Solution73().setZeroes(arr);
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
	}
}

class Solution73 {
	public void setZeroes(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return;

		boolean[] m = new boolean[matrix.length];
		boolean[] n = new boolean[matrix[0].length];
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				if (matrix[i][j] == 0) {
					m[i] = true;
					n[j] = true;
				}
			}
		}
		for (int i = 0; i < m.length; ++i) {
			for (int j = 0; j < n.length; ++j) {
				if (m[i] || n[j])
					matrix[i][j] = 0;
			}
		}
	}
}