package simple;

public class Main0766托普利茨矩阵 {
	public static void main(String[] args) {

		System.out.println(
				new Solution766().isToeplitzMatrix(new int[][] { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } }));
	}
}

class Solution766 {
	public boolean isToeplitzMatrix(int[][] matrix) {
		for (int i = 0; i < matrix[0].length - 1; i++) {// 第一行 - 1
			int row = 0, col = i;
			int temp = matrix[0][i];
			while (row < matrix.length && col < matrix[0].length) {
				if (matrix[row][col] != temp) {
					return false;
				}
				row++;
				col++;
			}
		}
		for (int j = 1; j < matrix.length - 1; j++) {// 第一列 - 1
			int temp = matrix[j][0];
			int row = j, col = 0;
			while (row < matrix.length && col < matrix[0].length) {
				if (matrix[row][col] != temp) {
					return false;
				}
				row++;
				col++;
			}
		}
		return true;
	}
}