package bitmanipulation;

public class Main0191NumberOf1InBinary {
	public static void main(String[] args) {
		System.out.println(new Solution191().hammingWeight(31));
	}
}

class Solution191 {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);//ÿ�ν�n���ұ�һ��1��Ϊ0
			count++;
		}					
		return count;
	}
}

class Solution0191 {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		return Integer.bitCount(n);
	}
}