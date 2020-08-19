package bitmanipulation;

public class Main0371SumofTwoIntegers {
	public static void main(String[] args) {
		System.out.println(new Solution371().add(5, 3));
		System.out.println(new Solution371().minus(5, 3));
		System.out.println(new Solution371().multip(5, 3));
		System.out.println(new Solution371().div(5, 3));
	}
}

/**
 * 加法运算:无进位加法 + 进位后左移
 */
class Solution371 {
	public int add(int a, int b) {
		while (b != 0) {
			int ans = a ^ b;
			b = (a & b) << 1;
			a = ans;
		}
		return a;
	}

	/**
	 * 减法运算：a + (-b)
	 * 得到一个数的相反数：b取反 + 1(~b + 1) 补码
	 */
	public int negNum(int n) {
		return add(~n, 1);
	}

	public int minus(int a, int b) {
		return add(a, negNum(b));
	}

	/**
	 * 乘法运算：相当于加法运算
	 * a×b 的结果可以写成 a×2⁰×b0 + a×2×b1 + ... + a ×2^i × bi +...+ a×2^31× b31，
	 * a = 22 = 0001 0110 
	 * b = 13 = 0000 1101
	 * 22*1 + 22*4 + 22*8 = 22*13
	 */
	public int multip(int a, int b) {
		int res = 0;
		while (b != 0) {
			if ((b & 1) != 0) {
				res = add(res, a);
			}
			a <<= 1;
			b >>>= 1;
		}
		return res;
	}
	
	/**
	 * 除法运算
	 */
	public boolean isNeg(int n) {
		return n < 0;
	}
	
	public int div(int a, int b) {
		int x = isNeg(a)? negNum(a) : a;
		int y = isNeg(b)? negNum(b) : b;
		int res = 0;
		for (int i = 31; i >= 0; i = minus(i, 1)) {
			if ((x >> 1) >= y) {
				res |= (1 << i);
				x = minus(x, y << i);
			}
		}
		return isNeg(a) ^ isNeg(b) ? negNum(res) : res;
	}
}

// 递归
class Solution0371 {
	public int add(int a, int b) {
		if (b == 0)
			return a;
		return add(a ^ b, (a & b) << 1);
	}
}