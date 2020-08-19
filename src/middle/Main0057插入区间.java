package middle;

import java.util.ArrayList;
import java.util.List;

public class Main0057²åÈëÇø¼ä {
	public static void main(String[] args) {

		int[][] is = new Solution57().insert(new int[][] { { 1, 3 }, { 6, 9 } }, new int[] { 2, 5 });
		for (int[] is2 : is) {
			for (int i : is2) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

class Solution57 {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> res = new ArrayList<>();
		int i = 0;
		while (i < intervals.length && newInterval[0] > intervals[i][1]) {
			res.add(intervals[i]);
			i++;
		}
		int[] tmp = new int[] { newInterval[0], newInterval[1] };
		while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
			tmp[0] = Math.min(tmp[0], intervals[i][0]);
			tmp[1] = Math.max(tmp[1], intervals[i][1]);
			i++;
		}
		res.add(tmp);
		while (i < intervals.length) {
			res.add(intervals[i]);
			i++;
		}
		return res.toArray(new int[0][]);
	}
}