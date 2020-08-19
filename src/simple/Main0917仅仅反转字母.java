package simple;

public class Main0917������ת��ĸ {
	public static void main(String[] args) {

		System.out.println(new Solution917().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
	}
}

class Solution917 {
	public String reverseOnlyLetters(String S) {
		if(S.length() == 0)
			return "";
		char[] c = S.toCharArray();
		int left = 0, right = c.length - 1;

		while (left < right) {
			while (left < right && !Character.isLetter(c[left]))
				left++;
			while (left < right && !Character.isLetter(c[right]))
				right--;
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			left++;
			right--;
		}

		return String.valueOf(c);
	}
}