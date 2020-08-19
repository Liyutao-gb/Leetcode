package simple;

public class Main0125验证回文串 {
	public static void main(String[] args) {

		System.out.println(new Solution0125().isPalindrome("A man, a plan, a canal: Panama"));
	}
}

class Solution0125 {
	public boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while(start < end){
			while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
				start++;
			}
			while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
				end--;
			}
			if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}