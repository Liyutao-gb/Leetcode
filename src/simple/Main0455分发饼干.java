package simple;

import java.util.Arrays;

public class Main0455·Ö·¢±ý¸É {
	public static void main(String[] args) {

		System.out.println(new Solution455().findContentChildren(new int[] { 7, 8, 9, 10 }, new int[] { 5, 6, 7, 8 }));
	}
}

class Solution455 {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0, j = 0;
		while (i < g.length && j < s.length) {
			if (g[i] <= s[j]) {
				i++;
			}
			j++;
		}
		return i;
	}
}