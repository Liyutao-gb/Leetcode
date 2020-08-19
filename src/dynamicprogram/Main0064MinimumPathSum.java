package dynamicprogram;

public class Main0064MinimumPathSum {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(new Solution64().minPathSum(matrix));
	}
}

class Solution64 {
	public int minPathSum(int[][] grid) {
		if (grid == null || grid.length <= 0)
			return 0;

		int rows = grid.length;
		int cols = grid[0].length;
		for (int i = 1; i < cols; i++) {
			grid[0][i] += grid[0][i - 1];
		}
		for (int i = 1; i < rows; i++) {
			grid[i][0] += grid[i - 1][0];
		}

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
			}
		}
		return grid[rows - 1][cols - 1];
	}
}

class Solution064 {
	public int minPathSum(int[][] grid) {
		if (grid == null || grid.length <= 0)
			return 0;

		int rows = grid.length;
		int cols = grid[0].length;
		int[] minPath = new int[cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int left = Integer.MAX_VALUE;
				int up = Integer.MAX_VALUE;
				if (i > 0)
					up = minPath[j];
				if (j > 0)
					left = minPath[j - 1];
				if (i == 0 && j == 0)
					minPath[j] = grid[0][0];
				else
					minPath[j] = Math.min(up, left) + grid[i][j];
			}
		}
		return minPath[cols - 1];
	}
}