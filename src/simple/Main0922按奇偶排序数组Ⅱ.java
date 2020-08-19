package simple;

public class Main0922°´ÆæÅ¼ÅÅÐòÊý×é¢ò {
	public static void main(String[] args) {

		int[] ii = new Solution0922().sortArrayByParityII(new int[] { 4, 2, 5, 7 });
		for (int i : ii) {
			System.out.println(i);
		}
	}
}

class Solution0922 {
	public int[] sortArrayByParityII(int[] A) {
		int even = 0, odd = 1;

		while (even < A.length && odd < A.length) {
			while (even < A.length && A[even] % 2 == 0)
				even += 2;
			while (odd < A.length && A[odd] % 2 != 0)
				odd += 2;
			if (even < A.length && odd < A.length) {
				int temp = A[even];
				A[even] = A[odd];
				A[odd] = temp;
			}
			even += 2;
			odd += 2;
		}
		return A;
	}
}

class Solution922 {
	public int[] sortArrayByParityII(int[] A) {
		int[] B = new int[A.length];
		int even = 0, odd = 1;

		for (int i : A) {
			if (i % 2 == 0) {
				B[even] = i;
				even += 2;
			} else {
				B[odd] = i;
				odd += 2;
			}
		}

		return B;
	}
}