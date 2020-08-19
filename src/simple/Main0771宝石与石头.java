package simple;

public class Main0771宝石与石头 {
	public static void main(String[] args) {

		System.out.println(new Solution771().numJewelsInStones("aA", "aAAbbbb"));
	}
}

class Solution771 {
	public int numJewelsInStones(String J, String S) {
		int[] A = new int[26];
		int[] a = new int[26];
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z')
				a[S.charAt(i) - 'a']++;
			else
				A[S.charAt(i) - 'A']++;
		}
		int sum = 0;
		for (int i = 0; i < J.length(); i++) {
			if (J.charAt(i) >= 'a' && J.charAt(i) <= 'z')
				sum += a[J.charAt(i) - 'a'];
			else
				sum += A[J.charAt(i) - 'A'];
		}
		return sum;
	}
}