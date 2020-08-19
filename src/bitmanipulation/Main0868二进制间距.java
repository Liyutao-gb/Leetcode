package bitmanipulation;

public class Main0868二进制间距 {
	public static void main(String[] args) {

		System.out.println(new Solution868().binaryGap(4));// 101
	}
}

class Solution868 {
	public int binaryGap(int N) {
		int gap = 0;
		int index = 0, temp = 0, cou = 0;
		while (N != 0) {
			if ((N & 1) == 1) {
				cou++;
				if (cou > 1) {
					gap = Math.max(gap, index - temp);
				}
				temp = index;
			}
			index++;
			N >>= 1;
		}
		return gap;
	}
}