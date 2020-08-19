package simple;

public class Main0566ÖØËÜ¾ØÕó {
	public static void main(String[] args) {

		int[][] a = new Solution566().matrixReshape(new int[][] { { 1, 2 }, { 3, 4 } }, 1, 4);
		for (int[] is : a) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

class Solution566 {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if (r * c != nums.length * nums[0].length)
			return nums;
		int[] cur = new int[r * c];
		int index = 0;
		for (int[] i : nums) {
			for (int j : i) {
				cur[index++] = j;
			}
		}
		int[][] res = new int[r][c];
		int ind = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				res[i][j] = cur[ind++];
			}
		}
		return res;
	}
}