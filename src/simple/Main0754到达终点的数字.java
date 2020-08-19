package simple;

public class Main0754到达终点的数字 {
	public static void main(String[] args) {

		System.out.println(new Solution754().reachNumber(7));
	}
}

class Solution754 {
	public int reachNumber(int target) {
		target = Math.abs(target);
		int count = 0;
		int sum = 0;
		while (sum < target) {
			count++;
			sum += count;
		}						   //target=4 sum=6 		0 -1 1 4
		if ((sum - target) % 2 != 0) {
			if (count % 2 == 0) {//target=7 sum=10 count=4 		0 1 3 6 2 7
				count += 1;
			} else {//
				count += 2;
			}
		}
		return count;
	}
}