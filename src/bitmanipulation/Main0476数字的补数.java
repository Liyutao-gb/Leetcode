package bitmanipulation;

public class Main0476Êý×ÖµÄ²¹Êý {
	public static void main(String[] args) {

		System.out.println(new Solution476().findComplement(5));
	}
}

class Solution476 {
	public int findComplement(int num) {
		int temp = num, bit = 0;
		while (temp != 0) {
			bit = (bit << 1) + 1;
			temp >>= 1;
		}
		return num ^ bit;
	}
}