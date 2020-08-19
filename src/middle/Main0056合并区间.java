package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main0056合并区间 {
	public static void main(String[] args) {
		int[][] is = new Solution56().merge(new int[][] { { 1, 4 }, { 0, 4 } });
		for (int[] is2 : is) {
			for (int i : is2) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

// int[] a; int[] a = new int[0];
// 先判断数组是否为null,再进行下一步判断
class Solution56 {
	public int[][] merge(int[][] intervals) {
		List<int[]> res = new ArrayList<>();
		if (intervals == null || intervals.length == 0)
			return res.toArray(new int[0][]);

		// Arrays.sort(intervals, (a, b) -> a[0] - b[0]);// a[0] - b[0]大于0就交换顺序
		// 根据二维数组第一个数字大小按每一行整体进行排序
		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}
		});
		int i = 0;
		while (i < intervals.length) {
			int left = intervals[i][0];
			int right = intervals[i][1];
			// i不能到最后一行,所以要小于length - 1
			// 判断所在行的right和下一行的left大小,对right重新进行最大值赋值,之后再不断进行while循环判断
			while (i < intervals.length - 1 && right >= intervals[i + 1][0]) {
				i++;
				right = Math.max(right, intervals[i][1]);
			}
			res.add(new int[] { left, right });
			i++;
		}
		return res.toArray(new int[0][]);
	}
}