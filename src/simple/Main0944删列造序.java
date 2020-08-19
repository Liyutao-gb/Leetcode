package simple;

public class Main0944…æ¡–‘Ï–Ú {
	public static void main(String[] args) {

		System.out.println(new Solution944().minDeletionSize(new String[] { "cba", "daf", "ghi" }));
	}
}

class Solution944 {
	public int minDeletionSize(String[] A) {
		int ans = 0;
		for (int i = 0; i < A[0].length(); i++) {
			for (int j = 0; j < A.length - 1; j++) {
				if (A[j].charAt(i) > A[j + 1].charAt(i)) {
					ans++;
					break;
				}
			}
		}
		return ans;
	}
}