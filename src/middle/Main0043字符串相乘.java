package middle;

public class Main0043×Ö·û´®Ïà³Ë {
	public static void main(String[] args) {

		System.out.println(new Solution43().multiply("123", "456"));
	}
}

// 415 ×Ö·û´®Ïà¼Ó
class Solution43 {
	public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0"))
			return "0";

		int len1 = num1.length(), len2 = num2.length();
		int[][] arr = new int[len2][len1 + len2];
		int pos = 0;
		for (int j = len2 - 1; j >= 0; j--) {
			StringBuilder s = new StringBuilder();
			int temp = 0;
			for (int i = len1 - 1; i >= 0; i--) {
				temp += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				s.append(temp % 10);
				temp /= 10;
			}
			if (temp != 0)
				s.append(temp);
			int k = 0, index = arr[0].length - 1 - pos;
			while (k < s.length()) {
				arr[pos][index--] = s.charAt(k) - '0';
				k++;
			}
			pos++;
		}
		StringBuilder s = new StringBuilder();
		int temp = 0;
		for (int k = arr[0].length - 1; k >= 0; k--) {
			for (int i = 0; i < arr.length; i++) {
				temp += arr[i][k];
			}
			s.append(temp % 10);
			temp /= 10;
		}
		String res = s.reverse().toString();
		int i = 0;
		while (res.charAt(i) == '0')
			i++;
		return res.substring(i);
	}
}