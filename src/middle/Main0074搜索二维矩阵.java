package middle;

public class Main0074ËÑË÷¶þÎ¬¾ØÕó {
	public static void main(String[] args) {
		System.out.println(new Solution74().searchMatrix(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }, 2));
	}
}

class Solution74 {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0)
			return false;
		
		int row = 0, col = matrix[0].length - 1;
		while (row < matrix.length && col >= 0) {
			if (target == matrix[row][col])
				return true;
			else if (target > matrix[row][col])
				row++;
			else
				col--;
		}
		return false;
	}
}