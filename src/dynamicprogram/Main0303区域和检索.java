package dynamicprogram;

public class Main0303ÇøÓòºÍ¼ìË÷ {
	public static void main(String[] args) {

		int[] a = new int[] { -2, 0, 3, -5, 2, -1 };
		System.out.println(new NumArray(a).sumRange(0, 2));
	}
}

class NumArray {
	private int[] sum;

	public NumArray(int[] num) {
		if (num.length == 0)
			return;
		sum = new int[num.length];
		sum[0] = num[0];
		for (int i = 1; i < num.length; i++) {
			sum[i] = sum[i - 1] + num[i];
		}
	}

	public int sumRange(int i, int j) {
		if (i == 0) {
			return sum[j];
		}
		return sum[j] - sum[i - 1];
	}
}

// ½â2
class NumArray1 {
	private int[] sum;

	public NumArray1(int[] nums) {
		sum = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			sum[i + 1] = sum[i] + nums[i]; // sum[0] = 0
		}
	}

	public int sumRange(int i, int j) {
		return sum[j + 1] - sum[i];
	}
}
