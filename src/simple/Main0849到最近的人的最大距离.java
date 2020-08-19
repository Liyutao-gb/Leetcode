package simple;

public class Main0849到最近的人的最大距离 {
	public static void main(String[] args) {

		System.out.println(new Solution849().maxDistToClosest(new int[] { 1, 0, 0, 0, 1, 0, 1 }));
	}
}

class Solution849 {
	public int maxDistToClosest(int[] seats) {
		int ans = 1, preOne = -1;
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == 1) {
				if (preOne == -1) {
					ans = Math.max(ans, i);
				} else {
					ans = Math.max(ans, (i - preOne) / 2);
				}
				preOne = i;
			}
		}
		return Math.max(ans, seats.length - 1 - preOne);
	}
}