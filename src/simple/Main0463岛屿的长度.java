package simple;

public class Main0463岛屿的长度 {
	public static void main(String[] args) {

		System.out.println(new Solution463()
				.islandPerimeter(new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } }));
	}
}

// 重点关注前面遍历过得方格，如果之前有相邻方格，就-2
class Solution463 {
	public int islandPerimeter(int[][] grid) {
		int rsp = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					rsp += 4;
					if (i > 0 && grid[i - 1][j] == 1) { // 第二行以上和上一行有相邻的-2
						rsp -= 2;
					}
					if (j > 0 && grid[i][j - 1] == 1) { // 第二列以后和之前相邻的-2
						rsp -= 2;
					}
				}
			}
		}
		return rsp;
	}
}