package simple;

public class Main0696计数二进制子串 {
	public static void main(String[] args) {

		System.out.println(new Solution696().countBinarySubstrings("00110011"));
	}
}

class Solution696 {
	public int countBinarySubstrings(String s) {
		char[] chars = s.toCharArray();
		int count = 1, pre = 0;
		int res = 0;
		for (int i = 1; i < chars.length; i++){
			if (chars[i - 1] == chars[i])
				count++;
			else {
				res += Math.min(pre, count);
				pre = count;
				count = 1;
			}			
		}
		res += Math.min(pre, count);
		return res;
	}
}