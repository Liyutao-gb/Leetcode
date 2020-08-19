package simple;

public class Main0905°´ÆæÅ¼ÅÅÐòÊý×é {
	public static void main(String[] args) {

		int[] is = new Solution905().sortArrayByParity(new int[] { 3, 1, 2, 4 });
		for (int i : is) {
			System.out.print(i + " ");
		}
	}
}

class Solution905 {
	public int[] sortArrayByParity(int[] A) {
		int left = 0, right = A.length - 1;
		while (left < right) {
			while (left < right && A[left] % 2 == 0)
				left++;
			while (left < right && A[right] % 2 != 0)
				right--;
			int temp = A[left];
			A[left] = A[right];
			A[right] = temp;
			left++;
			right--;
		}
		return A;
	}
}