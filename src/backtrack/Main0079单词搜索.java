package backtrack;

public class Main0079单词搜索 {
	public static void main(String[] args) {

		System.out.println(new Solution79().exist(new char[][] { 
						{ 'A', 'B', 'C', 'E' }, 
						{ 'S', 'F', 'C', 'S' }, 
						{ 'A', 'D', 'E', 'E' } },
							"ABCCED"));
	}
}

class Solution79 {
	int row;
	int col;
	char[][] board;
	String word;
	boolean[][] marked;// true：走通的路,false：走不通的路

	public boolean exist(char[][] board, String word) {
		row = board.length;
		col = board[0].length;
		if (row == 0)
			return false;

		marked = new boolean[row][col];
		this.board = board;
		this.word = word;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (dfs(i, j, 0))
					return true;
			}
		}
		return false;
	}

	public boolean dfs(int i, int j, int start) {
		if (start == word.length() - 1)
			return board[i][j] == word.charAt(start);

		if (board[i][j] == word.charAt(start)) {
			marked[i][j] = true;
			if (isVaild(i - 1, j) && !marked[i - 1][j] && dfs(i - 1, j, start + 1)) {
				return true;
			} else if (isVaild(i, j + 1) && !marked[i][j + 1] && dfs(i, j + 1, start + 1)) {
				return true;
			} else if (isVaild(i + 1, j) && !marked[i + 1][j] && dfs(i + 1, j, start + 1)) {
				return true;
			} else if (isVaild(i, j - 1) && !marked[i][j - 1] && dfs(i, j - 1, start + 1)) {
				return true;
			} else{
				marked[i][j] = false;
			}
		}
		return false;
	}

	public boolean isVaild(int i, int j) {
		return i >= 0 && i < row && j >= 0 && j < col;
	}
}