package simple;

public class Main07171比特和2比特字符 {
	public static void main(String[] args) {

		System.out.println(new Solution717().isOneBitCharacter(new int[] { 1, 1, 1, 0 }));
	}
}

class Solution0717 {
	public boolean isOneBitCharacter(int[] bits) {
		int i = 0;// 数组下标i
		while (i < bits.length - 1) {
			i += bits[i] + 1;
		}
		return i == bits.length - 1;
	}
}

class Solution717 {
	public boolean isOneBitCharacter(int[] bits) {
		for (int i = 0; i < bits.length;) {
			if (i == bits.length - 1)
				return true;
			else
				i += bits[i] == 1 ? 2 : 1;
		}
		return false;
	}
}