package bigdata;

public class NumbersOfIsland {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 } };
		int i = getNumberOfIsland(matrix);
		System.out.println(i);
	}

	public static int getNumberOfIsland(int[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					isValidIsland(matrix, i, j);
					count++;
				}
			}
		}
		return count;
	}

	public static void isValidIsland(int[][] matrix, int i, int j) {
		if (i < 0 || j < 0 || i > matrix.length - 1 || j > matrix[0].length - 1 || matrix[i][j] != 1)
			return;
		matrix[i][j] = 2;
		isValidIsland(matrix, i + 1, j);
		isValidIsland(matrix, i - 1, j);
		isValidIsland(matrix, i, j - 1);
		isValidIsland(matrix, i, j + 1);
	}
}
