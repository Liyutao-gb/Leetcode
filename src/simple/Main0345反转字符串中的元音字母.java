package simple;

public class Main0345反转字符串中的元音字母 {
	public static void main(String[] args) {

		System.out.println(new Solution345().reverseVowels("hello"));
	}
}

class Solution345 {
	public String reverseVowels(String s) {
		char[] c = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			while (start < end && !isVaild(c[start])) {
				start++;
			}
			while (start < end && !isVaild(c[end])) {
				end--;
			}
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
		return String.valueOf(c);
	}

	private boolean isVaild(char c) {
		return c == 'A' || c == 'O' || c == 'E' || c == 'I' || c == 'U' || 
			   c == 'a' || c == 'o' || c == 'e' || c == 'i'|| c == 'u';
	}
}