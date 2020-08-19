package middle;

import java.util.Arrays;

public class Main0059ÂİĞı¾ØÕó¢ò {
	public static void main(String[] args) {
		int[][] is = new Solution59().generateMatrix(3);
		for (int[] is2 : is) {
			System.out.println(Arrays.toString(is2));
		}
	}
}

class Solution59 {
	public int[][] generateMatrix(int n) {
		int[][] arr = new int[n][n];
		int count = (n + 1) / 2;
		int i = 0, num = 1;
		while (i < count) {
			for (int j = i; j < n - i; j++) {
				arr[i][j] = num++;
			}
			for (int j = i + 1; j < n - i; j++) {
				arr[j][n - i - 1] = num++;
			}

			for (int j = (n - 1) - (i + 1); j >= i; j--) {
				arr[n - i - 1][j] = num++;
			}
			for (int j = (n - 1) - (i + 1); j >= i + 1; j--) {
				arr[j][i] = num++;
			}
			i++;
		}
		return arr;
	}
}