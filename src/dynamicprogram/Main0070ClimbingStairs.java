package dynamicprogram;

public class Main0070ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(new Solution70().climbStairs(3));
	}
}

class Solution70 {
	public int climbStairs(int n) {
		if(n == 1)
			return 1;
		if (n == 2)
			return 2;
		int first = 0, second = 2, third = 1;
		for (int i = 3; i <= n; i++) {
			first = second + third;
			third = second;
			second = first;
		}
		return first;
	}
}

class Solution070 {
	public int climbStairs(int n) {
		if(n < 1)
			return 0;
		if (n == 2 || n == 1)
			return n;
		return climbStairs(n - 1) + climbStairs(n - 2);
	}
}