package simple;

public class Main0463����ĳ��� {
	public static void main(String[] args) {

		System.out.println(new Solution463()
				.islandPerimeter(new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } }));
	}
}

// �ص��עǰ��������÷������֮ǰ�����ڷ��񣬾�-2
class Solution463 {
	public int islandPerimeter(int[][] grid) {
		int rsp = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					rsp += 4;
					if (i > 0 && grid[i - 1][j] == 1) { // �ڶ������Ϻ���һ�������ڵ�-2
						rsp -= 2;
					}
					if (j > 0 && grid[i][j - 1] == 1) { // �ڶ����Ժ��֮ǰ���ڵ�-2
						rsp -= 2;
					}
				}
			}
		}
		return rsp;
	}
}