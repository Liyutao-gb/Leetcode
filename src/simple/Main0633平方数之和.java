package simple;

public class Main0633平方数之和 {
	public static void main(String[] args) {

		System.out.println(new Solution633().judgeSquareSum(2));
	}
}

class Solution633 {
	public boolean judgeSquareSum(int c) {
		int pre = 0;
		int post = (int) Math.sqrt(c);
		while (pre <= post) {
			if (pre * pre + post * post == c) {
				return true;
			}else if (pre * pre + post * post < c) {
				pre++;
			} else {
				post--;
			}
		}
		return false;
	}
}