package dynamicprogram;

public class CowProblem {
	public static void main(String[] args) {
		System.out.println(s1(6));
		System.out.println(s2(6));
	}

	public static int s1(int n) {
		if (n < 1)
			return 0;
		if (n <= 4)
			return n;
		return s1(n - 1) + s1(n - 3);
	}

	public static int s2(int n) {
		if (n < 1)
			return 0;
		if (n <= 4)
			return n;
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int temp = 0;
		for (int i = 5; i <= n; i++) {
			temp = d + b;
			a = b;
			b = c;
			c = d;
			d = temp;
		}
		return temp;
	}
}
