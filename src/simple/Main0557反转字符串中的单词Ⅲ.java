package simple;

public class Main0557反转字符串中的单词Ⅲ {
	public static void main(String[] args) {

		System.out.println(new Solution557().reverseWords("Let's take LeetCode contest"));
	}
}

class Solution557 {
	public String reverseWords(String s) {
		String[] str = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for (String s1 : str) {
			sb.append(new StringBuffer(s1).reverse());
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}