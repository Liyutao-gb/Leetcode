package simple;

public class Main1137第N个泰波那契数 {
	public static void main(String[] args) {

		System.out.println(new Solution5139().tribonacci(25));
	}
}

class Solution5139 {
	public int tribonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 2 || n == 1) 
			return 1;
		int first = 0;
		int second = 1;
		int third = 1;
		int ans = 0;
		for (int i = 3; i <= n; i++) {
			ans = first + second + third;
			first = second;
			second = third;
			third = ans;
		}
		return ans;
	}
}