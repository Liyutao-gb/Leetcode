package dynamicprogram;

public class Main0063UniquePathsⅡ {
	public static void main(String[] args) {
		int[][] matrix = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		System.out.println(new Solution63().uniquePathsWithObstacles(matrix));
	}
}

class Solution63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid[0][0] == 1)
			return 0;

		int R = obstacleGrid.length;
		int C = obstacleGrid[0].length;

		obstacleGrid[0][0] = 1;
		// 值为1意味着有障碍，不能走，所以设置值为0，否则将前一个的值赋到当前位置
		for (int i = 1; i < R; i++) {
			if (obstacleGrid[i][0] == 1)
				obstacleGrid[i][0] = 0;
			else
				obstacleGrid[i][0] = obstacleGrid[i - 1][0];
		}

		for (int i = 1; i < C; i++) {
			if (obstacleGrid[0][i] == 1)
				obstacleGrid[0][i] = 0;
			else
				obstacleGrid[0][i] = obstacleGrid[0][i - 1];
		}

		for (int i = 1; i < R; i++) {
			for (int j = 1; j < C; j++) {
				if (obstacleGrid[i][j] == 1)
					obstacleGrid[i][j] = 0;
				else
					obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
			}
		}
		return obstacleGrid[R - 1][C - 1];
	}
}
