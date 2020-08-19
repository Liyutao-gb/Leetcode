package simple;

public class Main0961重复N次的元素 {
	public static void main(String[] args) {

		System.out.println(new Solution961().repeatedNTimes(new int[] { 2, 1, 2, 5, 3, 2 }));
	}
}

class Solution961 {
	public int repeatedNTimes(int[] A) {
		for (int k = 1; k <= 3; k++)
			for (int i = 0; i < A.length - k; i++)
				if (A[i] == A[i + k])
					return A[i];

		throw null;
	}
}