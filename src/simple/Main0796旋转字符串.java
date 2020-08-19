package simple;

public class Main0796旋转字符串 {
	public static void main(String[] args) {

		System.out.println(new Solution796().rotateString("abcde", "cdeab"));
	}
}

// 旋转特性
class Solution0796 {
	public boolean rotateString(String A, String B) {
		return A.length() == B.length() && (A + A).contains(B);
	}
}

class Solution796 {
	public boolean rotateString(String A, String B) {
		if (A.equals(B))
			return true;
		for (int i = 1; i < A.length(); i++) {
			String s = A.substring(i) + A.substring(0, i);
			if (s.equals(B)) {
				return true;
			}
		}
		return false;
	}
}