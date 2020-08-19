package simple;

public class Main1154一年中的第几天 {
	public static void main(String[] args) {

		System.out.println(new Solution1154().ordinalOfDate("2004-03-01"));
	}
}

class Solution1154 {
	public int ordinalOfDate(String date) {
		int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] split = date.split("-");
		int y = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		int d = Integer.parseInt(split[2]);
		int ans = 0;
		for (int i = 0; i < m - 1; i++) {
			if (i == 1 && ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))) {
				ans += 29;
			}else {
				ans += day[i];
			}
		}
		return ans + d;
	}
}