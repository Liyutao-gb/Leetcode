package simple;

public class Main0812最大三角形面积 {
	public static void main(String[] args) {

		System.out.println(new Solution812()
				.largestTriangleArea(new int[][] { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 0, 2 }, { 2, 0 } }));
	}
}

class Solution812 {
	public double largestTriangleArea(int[][] points) {
		int maxRow = Integer.MIN_VALUE;
		int minRow = Integer.MAX_VALUE;
		int maxCol = Integer.MIN_VALUE;
		int minCol = Integer.MAX_VALUE;
		for (int i = 0; i < points.length; i++) {
			if (points[i][0] > maxRow) {
				maxRow = points[i][0];
			}
			if (points[i][0] < minRow) {
				minRow = points[i][0];
			}
			if (points[i][1] > maxCol) {
				maxCol = points[i][1];
			}
			if (points[i][1] < minCol) {
				minCol = points[i][1];
			}
		}
		return (double)(maxRow - minRow) * (maxCol - minCol) / 2;
	}
}