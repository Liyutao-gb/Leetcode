package simple;

import java.util.HashSet;
import java.util.Set;

public class Main0929独特的电子邮件地址 {
	public static void main(String[] args) {

		System.out.println(new Solution929().numUniqueEmails(new String[] { "test.email+alex@leetcode.com",
				"test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com" }));
	}
}

class Solution929 {
	public int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<>();
		for (String s : emails) {
			String[] split = s.split("@");
			StringBuffer s1 = new StringBuffer();
			for (int i = 0; i < split[0].length(); i++) {
				if (split[0].charAt(i) == '+')
					break;
				else if (split[0].charAt(i) != '.')
					s1.append(split[0].charAt(i));
			}
			set.add(s1 + "@" + split[1]);
		}
		return set.size();
	}
}