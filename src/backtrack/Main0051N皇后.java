package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Main0051N皇后 {
	public static void main(String[] args) {
		List<List<String>> list = new Solution51().solveNQueens(4);
		for (List<String> list2 : list) {
			System.out.println(list2);
		}
	}
}

class Solution51 {
	List<List<String>> outPut = new ArrayList<>();
	int[] queens;

	public List<List<String>> solveNQueens(int n) {
		queens = new int[n];

		backTrack(0, n);
		return outPut;
	}

	public void backTrack(int t, int n) {
		if (t == n) {
			standardPrint(queens);
		} else {
			for (int i = 0; i < n; i++) {
				queens[t] = i;
				// 使用约束条件剪去不必要分枝
				if (judge(t)) {
					backTrack(t + 1, n);
				}
			}
		}
	}

	// 约束条件
	public boolean judge(int t) {
		for (int i = 0; i < t; i++) {
			System.out.println(i + " " + t);
			if (Math.abs(t - i) == Math.abs(queens[t] - queens[i]) || queens[t] == queens[i]) {
				return false;
			}
		}
		return true;
	}

	public void standardPrint(int[] queens) {
		List<String> sList = new ArrayList<>();
		for (int q : queens) {
			StringBuilder s = new StringBuilder();
			for (int j = 0; j < queens.length; j++) {
				if (j == q)
					s.append("Q");
				else
					s.append(".");
			}
			sList.add(s.toString());
		}
		outPut.add(sList);
	}
}