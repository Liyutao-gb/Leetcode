package bitmanipulation;

public class Main0201���ַ�Χ��λ�� {
	public static void main(String[] args) {

		System.out.println(new Solution201().rangeBitwiseAnd(5, 7));
	}
}

class Solution201 {
	public int rangeBitwiseAnd(int m, int n) {
		int i = 0;
		while (m != n) {//�ҵ�����ǰ׺
			m >>= 1;
			n >>= 1;
			i++;
		}
		return m << i;//��λǰ׺
	}
}