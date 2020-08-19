package arrayandmatrix;

import java.util.Arrays;

public class MatrixRotatedby90DegreesClockwise {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		rotate90Degrees(matrix);
		for (int[] is : matrix) {
			System.out.println(Arrays.toString(is));
		}
	}

	/**
	 * 先沿 左上 - 右下 的对角线翻转，
	 * 再沿垂直中线 左右翻转，可以实现顺时针 90 度的旋转效果。
	 */
	public static void rotate90Degrees(int[][] matrix) {
		if (matrix == null || matrix.length <= 0)
			return;

		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = i + 1; j < cols; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < rows; i++) {
			int l = 0, r = cols - 1;
			while (l < r) {
				int temp = matrix[i][l];
				matrix[i][l++] = matrix[i][r];
				matrix[i][r--] = temp;
			}
		}
	}

	/**
	 * 精简写法
	 */
	public void rotate(int[][] matrix) {
		int rows = matrix.length;
		for (int i = 0; i < (rows + 1) / 2; i++) {
			for (int j = 0; j < rows / 2; j++) {
				int temp = matrix[rows - 1 - j][i];
				matrix[rows - 1 - j][i] = matrix[rows - 1 - i][rows - j - 1];
				matrix[rows - 1 - i][rows - j - 1] = matrix[j][rows - 1 - i];
				matrix[j][rows - 1 - i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
	}
}
