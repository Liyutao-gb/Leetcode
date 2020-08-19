package simple;

public class Main0680��֤�����ַ����� {
	public static void main(String[] args) {

		System.out.println(new Solution680().validPalindrome("abca"));
	}
}

class Solution680 {
	public boolean validPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;// "abca"
		while (left < right) {// ����������left=right��ʱ��
			// �������ߵ��ַ�����ȵ�ʱ��ѡ��������߻����ұߵ�һ���ַ�
			if (s.charAt(left) != s.charAt(right)) {
				return isPalindrome(s, left, right - 1) || isPalindrome(s, left + 1, right);
			}
			left++;
			right--;
		}
		return true;
	}

	private boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
}