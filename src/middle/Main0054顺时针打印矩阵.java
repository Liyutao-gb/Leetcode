package middle;

import java.util.ArrayList;
import java.util.List;

public class Main0054顺时针打印矩阵 {
	public static void main(String[] args) {

		System.out.println(new Solution54().spiralOrder(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8, }, { 9, 10, 11, 12 } }));
	}
}

class Solution54 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		if (matrix == null || matrix.length == 0)
			return list;

		int m = matrix.length;
		int n = matrix[0].length;
		int i = 0;
		// 统计矩阵从外向内的层数，如果矩阵非空，那么它的层数至少为1层
		int count = (Math.min(m, n) + 1) / 2;
		// 从外部向内部遍历，逐层打印数据
		while (i < count) {
			for (int j = i; j < n - i; j++) {
				list.add(matrix[i][j]);
			}
			for (int j = i + 1; j < m - i; j++) {
				list.add(matrix[j][(n - 1) - i]);
			}

			for (int j = (n - 1) - (i + 1); j >= i && (m - 1 - i != i); j--) {
				list.add(matrix[(m - 1) - i][j]);
			}
			for (int j = (m - 1) - (i + 1); j >= i + 1 && (n - 1 - i) != i; j--) {
				list.add(matrix[j][i]);
			}
			i++;
		}
		return list;
	}
}