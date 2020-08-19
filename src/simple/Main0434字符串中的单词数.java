package simple;

public class Main0434字符串中的单词数 {
	public static void main(String[] args) {

		System.out.println(new Solution434().countSegments("Hello, my name is John"));
	}
}

class Solution434 {
	public int countSegments(String s) {
        s = s.trim();
		if (s.equals(""))
			return 0;
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ')
				count++;
		}
		return count + 1;
	}
}