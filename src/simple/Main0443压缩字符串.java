package simple;

public class Main0443ѹ���ַ��� {
	public static void main(String[] args) {

		System.out.println(new Solution443().compress(new char[] { 'a', 'b', 'b' }));
	}
}

class Solution443 {
	public int compress(char[] chars) {
		int t = 0;// ����ָ��
		int i = 0;
		while (i < chars.length && t < chars.length) {		// �����ַ���
			chars[t++] = chars[i];		// ȡ��ͬ�ַ����е����ַ�����
			int temp = i;		// ��¼��ͬ�ַ�������Ԫ��λ��
			while (i < chars.length && chars[i] == chars[t - 1])
				i++;		// iָ�뻬������ͬ�ַ�����ĩβ����һ��λ��
			if (i - temp > 1) {			// ����ͬ�ַ����г��ȴ���1
				for (char c : String.valueOf(i - temp).toCharArray()) {// �����м�����ͬ�ַ����еĳ��ȵ��ַ���ʽ
					chars[t++] = c;
				}
			}
		}
		return t;// t��Ϊ��ѹ���Ľ���ĳ���
	}
}