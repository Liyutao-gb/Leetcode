package middle;

public class Main0048Ðý×ªÍ¼Ïñ {
	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		new Solution48().rotate(a);
		for (int[] is : a) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

// (i,j) , (j, n-i-1), (n-i-1, n-j-1), (n-j-1, i)
class Solution48 {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < (n + 1) / 2; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
				matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
				matrix[j][n - i - 1] = temp;
			}
		}
	}
}

class Solution048 {
	public void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - j - 1];
				matrix[i][matrix.length - j - 1] = temp;
			}
		}
	}
}