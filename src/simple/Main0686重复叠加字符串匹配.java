package simple;

public class Main0686�ظ������ַ���ƥ�� {
	public static void main(String[] args) {

		System.out.println(new Solution686().repeatedStringMatch("ab", "cdabcdab"));
	}
}

class Solution686 {
	public int repeatedStringMatch(String A, String B) {
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == B.charAt(0)) {
				int k = i;
				int count = 1;// ѭ������
				int j = 0;
				while (A.charAt(k) == B.charAt(j)) {
					k++;
					j++;
					if (j >= B.length())
						return count;
					if (k >= A.length()) {
						k = 0;
						count++;
					}
				}
			}
		}
		return -1;
	}
}