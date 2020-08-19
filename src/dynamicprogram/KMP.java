package dynamicprogram;

//KMP�㷨
//�����ƥ��ֵ�����ǡ�ǰ׺���͡���׺������Ĺ���Ԫ�صĳ���		
//	������		A	B	C	D	A	B	D
//	����ƥ���	0	0	0	0	1	2	0
public class KMP {
	public static void main(String[] args) {

		String str1 = "BBC ABCDAB ABCDABCDABDE";
		String str2 = "ABCDABD";
		int[] next = kmpNext(str2);
		int index = kmpSearch(str1, str2, next);
		System.out.println(index);
	}

	// kmp�����㷨
	/**
	 * 
	 * @param str1
	 *            Դ�ַ���
	 * @param str2
	 *            str2�Ӵ�
	 * @param next
	 *            ����ƥ���,���Ӵ���Ӧ�Ĳ���ƥ���
	 * @return �����-1����û��ƥ�䵽,���򷵻ص�һ��ƥ���λ��
	 */
	public static int kmpSearch(String str1, String str2, int[] next) {
		for (int i = 0, j = 0; i < str1.length(); i++) {
			// KMP�㷨����
			while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
				j = next[j - 1];
			}
			if (str1.charAt(i) == str2.charAt(j)) {
				j++;
			}
			if (j == str2.length()) {
				return i - j + 1;
			}
		}
		return -1;
	}

	// ��ȡ��һ���ַ���(�Ӵ�)�Ĳ���ƥ���
	public static int[] kmpNext(String dest) {
		// ����һ��next����
		int[] next = new int[dest.length()];
		next[0] = 0;// ����ַ�������Ϊ1,����ƥ������0
		for (int i = 1, j = 0; i < dest.length(); i++) {
			// KMP�㷨����
			while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
				j = next[j - 1];
			}
			if (dest.charAt(i) == dest.charAt(j)) {
				j++;
			}
			next[i] = j;
		}
		return next;
	}
}