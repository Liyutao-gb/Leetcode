package simple;

public class Main0657机器人能否返回原点 {
	public static void main(String[] args) {

		System.out.println(new Solution657().judgeCircle("UD"));
	}
}

class Solution657 {
	public boolean judgeCircle(String moves) {
		int leftRight = 0, upDown = 0;
		char[] c = moves.toCharArray();
		for (char d : c) {
			if (d == 'L') {
				leftRight++;
			} else if (d == 'R') {
				leftRight--;
			} else if (d == 'U') {
				upDown++;
			} else {
				upDown--;
			}
		}
		return leftRight == 0 && upDown == 0;
	}
}