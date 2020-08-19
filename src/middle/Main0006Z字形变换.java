package middle;

import java.util.ArrayList;
import java.util.List;

public class Main0006Z×ÖÐÎ±ä»» {
	public static void main(String[] args) {

		System.out.println(new Solution6().convert("LEETCODEISHIRING", 4));
	}
}

class Solution06 {
	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;

		List<StringBuilder> rows = new ArrayList<>();
		for (int i = 0; i < Math.min(numRows, s.length()); i++)
			rows.add(new StringBuilder());

		int curRow = 0;
		boolean goingDown = false;

		for (char c : s.toCharArray()) {
			rows.get(curRow).append(c);
			if (curRow == 0 || curRow == numRows - 1)
				goingDown = !goingDown;
			curRow += goingDown ? 1 : -1;
		}

		StringBuilder ret = new StringBuilder();
		for (StringBuilder row : rows)
			ret.append(row);
		return ret.toString();
	}
}

class Solution6 {
	public String convert(String s, int numRows) {
		char[][] ch = new char[numRows][s.length()];
		int m = 0, row = 0;
		loop: for (int j = 0; j < ch.length; j++) {
			if (m == s.length())
				break;
			ch[j][row] = s.charAt(m++);
			if (m == s.length())
				break;
			if (j == ch.length - 1) {
				for (int i = numRows - 2; i > 0; i--) {
					ch[i][++row] = s.charAt(m++);
					if (m == s.length()) {
						break loop;
					}
				}
				row++;
				j = -1;
			}
		}
		
		String result = "";
		for (char[] cs : ch) {
			for (char c : cs) {
				if (c != 0)
					result += c;
			}
		}
		return result;
	}
}