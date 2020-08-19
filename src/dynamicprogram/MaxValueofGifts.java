package dynamicprogram;

public class MaxValueofGifts {
	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 5, 9 }, { 8, 1, 3, 4 }, { 5, 0, 6, 1 }, { 8, 8, 4, 0} };
		System.out.println(maxVal(arr));
	}

	public static int maxVal(int[][] arr) {
		int rows = arr.length, cols = arr[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == 0 && j >= 1)
					arr[0][j] += arr[0][j - 1];
				else if (i >= 1 && j == 0)
					arr[i][0] += arr[i - 1][0];
				else if (i > 0 && j > 0)
					arr[i][j] += Math.min(arr[i - 1][j], arr[i][j - 1]);
				else
					continue;
			}
		}
		
		return arr[rows - 1][cols - 1];
	}
}