package simple;

public class Main0541·´×ª×Ö·û´®¢ò {
	public static void main(String[] args) {

		System.out.println(new Solution541().reverseStr("abcdefg",2));
	}
}

class Solution0541 {
	public String reverseStr(String s, int k) {
		char[] chars = s.toCharArray();
		int len = s.length();
		for (int i = 0; i < len; i = i + 2 * k) {
			if (i + k - 1 < len)
				reverse(chars, i, i + k - 1);
			else
				reverse(chars, i, len - 1);
		}
		return new String(chars);
	}

	public void reverse(char[] s, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
	}
}

class Solution541 {
	public String reverseStr(String s, int k) {
		if (k == 1)
			return s;
		int num = s.length() / (2 * k);
		StringBuilder ans = new StringBuilder();
		int j = 0, tem = 1;
		for (int i = 0; i < num; i++) {
			String str = s.substring(j, j + k);
			ans.append(new StringBuffer(str).reverse());
			ans.append(s.substring(j + k, j + 2 * k));
			j = (tem++) * 2 * k;
		}
		int rem = s.length() % (2 * k);
		if (rem < k) {
			ans.append(new StringBuffer(s.substring(s.length() - rem)).reverse());
		} else if (rem >= k) {
			ans.append(new StringBuffer(s.substring(num * 2 * k, num * 2 * k + k)).reverse());
			ans.append(new StringBuffer(s.substring(num * 2 * k + k)));
		}
		return ans.toString();
	}
}