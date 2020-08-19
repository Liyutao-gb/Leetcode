package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main0056�ϲ����� {
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
// ���ж������Ƿ�Ϊnull,�ٽ�����һ���ж�
class Solution56 {
	public int[][] merge(int[][] intervals) {
		List<int[]> res = new ArrayList<>();
		if (intervals == null || intervals.length == 0)
			return res.toArray(new int[0][]);

		// Arrays.sort(intervals, (a, b) -> a[0] - b[0]);// a[0] - b[0]����0�ͽ���˳��
		// ���ݶ�ά�����һ�����ִ�С��ÿһ�������������
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
			// i���ܵ����һ��,����ҪС��length - 1
			// �ж������е�right����һ�е�left��С,��right���½������ֵ��ֵ,֮���ٲ��Ͻ���whileѭ���ж�
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