package simple;

import java.util.Arrays;

public class Main0937重新排列日志文件 {
	public static void main(String[] args) {

		String[] strings = new Solution937().reorderLogFiles(
				new String[] { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo" });
		for (String string : strings) {
			System.out.println(string);
		}
	}
}

class Solution937 {
	public String[] reorderLogFiles(String[] logs) {
		Arrays.sort(logs, (log1, log2) -> {
			String[] split1 = log1.split(" ", 2);
			String[] split2 = log2.split(" ", 2);
			boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
			boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
			if (!isDigit1 && !isDigit2) {
				int cmp = split1[1].compareTo(split2[1]);
				if (cmp != 0)
					return cmp;
				return split1[0].compareTo(split2[0]);
			}
			return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
		});
		return logs;
	}
}