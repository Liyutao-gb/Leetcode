package simple;

public class Main0038±¨Êý {
	public static void main(String[] args) {

		System.out.println(new Solution038().countAndSay(4));
		// 1 11 21 1211 111221 312211
	}
}

class Solution038 {
	public String countAndSay(int n) {
		String s = "1";
		for (int i = 2; i <= n; i++) {
			StringBuffer buffer = new StringBuffer();
			char pre = s.charAt(0);
			int count = 1;
			for (int j = 1; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == pre) {
					count++;
				} else {
					buffer.append(count).append(pre);
					pre = c;
					count = 1;
				}
			}
			buffer.append(count).append(pre);
			s = buffer.toString();
		}
		return s;
	}
}