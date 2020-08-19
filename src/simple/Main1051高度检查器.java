package simple;

public class Main1051¸ß¶È¼ì²éÆ÷ {
	public static void main(String[] args) {

		System.out.println(new Solution1051().heightChecker(new int[] { 1, 1, 4, 2, 1, 3 }));
	}
}

class Solution1051 {
	public int heightChecker(int[] heights) {
		int[] arr = new int[101];
		for (int i : heights) {
			arr[i]++;
		}
		int count = 0;
		for (int i = 1, j = 0; i < arr.length; i++) {
			while (arr[i]-- > 0) {
				if (heights[j++] != i)
					count++;
			}
		}
		return count;
	}
}