package simple;

public class Main0058最后一个单词的长度 {
	public static void main(String[] args) {

		System.out.println(new Solution58().lengthOfLastWord(" aa "));
	}
}

class Solution58 {
	public int lengthOfLastWord(String s) {
		int end = s.length() - 1;
		while (end >= 0 && s.charAt(end) == ' ')
			end--;
		int start = end;
		while (start >= 0 && s.charAt(start) != ' ')
			start--;
		return end - start;
	}
}

class Solution058 {
	public int lengthOfLastWord(String s) {
		s = s.trim();
		return s.length() - s.lastIndexOf(" ") - 1;
	}
}