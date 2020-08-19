package simple;

public class Main0925³¤°´¼üÈë {
	public static void main(String[] args) {

		System.out.println(new Solution925().isLongPressedName("alex", "aaxleex"));
	}
}

class Solution925 {
	public boolean isLongPressedName(String name, String typed) {
		char[] c1 = name.toCharArray();
		char[] c2 = typed.toCharArray();
		int p1 = 0, p2 = 0;
		while (p1 < c1.length && p2 < c2.length) {
			if (c1[p1] == c2[p2]) {
				p1++;
			}
			p2++;
		}
		return p1 == c1.length;
	}
}