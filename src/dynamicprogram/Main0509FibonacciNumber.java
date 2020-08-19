package dynamicprogram;

public class Main0509FibonacciNumber {
	public static void main(String[] args) {
		System.out.println(new Solution0509().fib(3));
	}
}

class Solution0509 {
	public int fib(int N) {
		if (N < 1)
			return 0;
		if (N == 1 || N == 2)
			return 1;
		int first = 0, second = 1, third = 1;
		for (int i = 3; i <= N; i++) {
			first = second + third;
			third = second;
			second = first;
		}
		return first;
	}
}

class Solution509 {
	public int fib(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return fib(N - 1) + fib(N - 2);
	}
}