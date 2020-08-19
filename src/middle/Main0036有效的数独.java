package middle;

public class Main0036��Ч������ {
	public static void main(String[] args) {

		System.out.println(new Solution36().isValidSudoku(new char[][] {
				{ '5', '3', '.', '.', '7', '.', '1', '.', '.' }, 
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' }, 
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' }, 
				{ '7', '.', ',', '.', '2', '.', '.', '.', '6' },
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' }, 
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } }));
	}
}

class Solution036 {
	public boolean isValidSudoku(char[][] board) {
		// ��¼ĳ�У�ĳλ�����Ƿ��Ѿ����ڷ�
		boolean[][] row = new boolean[9][9];
		// ��¼ĳ�У�ĳλ�����Ƿ��Ѿ����ڷ�
		boolean[][] col = new boolean[9][9];
		// ��¼ĳ 3x3 �����ڣ�ĳλ�����Ƿ��Ѿ����ڷ�
		boolean[][] block = new boolean[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					int num = board[i][j] - '1';
					int blockIndex = i / 3 * 3 + j / 3;
					if (row[i][num] || col[j][num] || block[blockIndex][num]) {
						return false;
					} else {
						row[i][num] = true;
						col[j][num] = true;
						block[blockIndex][num] = true;
					}
				}
			}
		}
		return true;
	}
}

class Solution36 {
	public boolean isValidSudoku(char[][] board) {
		int[] rowCnt = new int[9];
		int[] colCnt = new int[9];
		int[] boxCnt = new int[9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if ('.' == board[i][j]) {
					continue;
				}
				int num = board[i][j] - 48;
				// ������
				if ((rowCnt[i] >> num) % 2 == 1) {
					return false;
				} else {
					rowCnt[i] += 1 << num;
				}
				// ������
				if ((colCnt[j] >> num) % 2 == 1) {
					return false;
				} else {
					colCnt[j] += 1 << num;
				}
				// �����
				int boxNum = i / 3 * 3 + j / 3;
				if ((boxCnt[boxNum] >> num) % 2 == 1) {
					return false;
				} else {
					boxCnt[boxNum] += 1 << num;
				}
			}
		}
		return true;
	}
}