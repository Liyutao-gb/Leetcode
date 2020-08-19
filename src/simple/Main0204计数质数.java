package simple;

public class Main0204计数质数 {
	public static void main(String[] args) {

		System.out.println(new Solution204().countPrimes(20));
	}
}

class Solution0204 {
	public int countPrimes(int n) {
		int count = 0;
		boolean[] flag = new boolean[n];
		for (int i = 2; i < n; i++) {
			if (flag[i] == false) {		
				count++;                
				for (int j = 1; j * i < n; j++) {
					flag[i * j] = true;
				}
			}
		}
		return count;
	}
}

class Solution204 {
	public int countPrimes(int n) {
		if (n < 3)
			return 0;
		int count = 1;
		loop: for (int i = 3; i < n; i += 2) {
			for (int j = 3; j <= Math.sqrt(i); j += 2) {
				if (i % j == 0) {
					continue loop;
				}
			}
			count++;
		}
		return count;
	}
}