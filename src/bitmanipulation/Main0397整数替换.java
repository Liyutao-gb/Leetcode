package bitmanipulation;

public class Main0397整数替换 {
	public static void main(String[] args) {

		System.out.println(new Solution397().integerReplacement(2147483647));
	}
}

class Solution397 {
	public int integerReplacement(int n) {
		int count = 0;
		long m = n;
		while (m != 1) {
			if (m % 2 == 0) {
				m >>= 1;
			} else if (m == 3) {// 3 另外拿出来
				return count + 2;
			} else if (((m + 1) / 2) % 2 == 0) {// 7 → +1 、 5 → -1
				m += 1;
			} else {
				m -= 1;
			}
			count++;
		}
		return count;
	}
}