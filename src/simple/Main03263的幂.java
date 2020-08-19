package simple;

public class Main03263µÄÃÝ {
	public static void main(String[] args) {

		System.out.println(new Solution326().isPowerOfThree(21));
	}
}

class Solution326 {
	public boolean isPowerOfThree(int n) {
		if(n == 0)
			return false;
		while (n % 3 == 0)
			n /= 3;
		return n == 1;
	}
}