package simple;

public class Main0168Excel±íÁÐÃû³Æ {
	public static void main(String[] args) {

		System.out.println(new Solution168().convertToTitle(53));
	}
}

class Solution168 {
	public String convertToTitle(int n) {
		StringBuffer sb = new StringBuffer();
		while (n != 0) {
			n -= 1;
			char c = (char) (n % 26 + 'A');
			n /= 26;
			sb.append(c);
		}
		return sb.reverse().toString();
	}
}