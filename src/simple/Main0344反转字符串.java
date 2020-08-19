package simple;

public class Main0344·´×ª×Ö·û´® {
	public static void main(String[] args) {

		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		new Solution344().reverseString(s);
		for (char c : s) {
			System.out.println(c);
		}
	}
}

class Solution344 {
	public void reverseString(char[] s) {
		if(s.length <= 2)
			return;
		int start = 0;
		int end = s.length - 1;
		while (start < end) {
			char temp = s[end];
			s[end] = s[start];
			s[start] = temp;
			start++;
			end--;
		}
	}
}