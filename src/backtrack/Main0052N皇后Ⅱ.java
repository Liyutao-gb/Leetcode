package backtrack;

public class Main0052N»Êºó¢ò {
	public static void main(String[] args) {
		System.out.println(new Solution52().totalNQueens(8));
	}
}

class Solution52 {
	int count = 0;
	int[] queens;

	public int totalNQueens(int n) {
		queens = new int[n];
		backtrack(0, n);
		return count;
	}

	public void backtrack(int t, int n) {
		if (t == n) {
			count++;
		} else {
			for (int i = 0; i < n; i++) {
				queens[t] = i;
				if (judge(t)) {
					backtrack(t + 1, n);
				}
			}
		}
	}

	public boolean judge(int t) {
		for (int i = 0; i < t; i++) {
			if (queens[t] == queens[i] || Math.abs(t - i) == Math.abs(queens[t] - queens[i])) {
				return false;
			}
		}
		return true;
	}
}