package simple;

public class Main0896单调数列 {
	public static void main(String[] args) {

		System.out.println(new Solution896().isMonotonic(new int[] { 1, 2, 2, 3 }));
	}
}

class Solution0896 {
	public boolean isMonotonic(int[] A) {
		boolean asc = false, desc = false;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] < A[i + 1]) {
				asc = true;
			}
			if (A[i] < A[i + 1]) {
				desc = true;
			}
			if (asc && desc) {
				return false;
			}
		}
		return true;
	}
}

class Solution896 {
	public boolean isMonotonic(int[] A) {
		int asc = 0, desc = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] <= A[i + 1]) {
				asc++;
			}
			if (A[i] >= A[i + 1]) {
				desc++;
			}
		}
		return asc == A.length - 1 || desc == A.length - 1;
	}
}