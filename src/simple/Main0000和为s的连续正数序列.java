package simple;

public class Main0000和为s的连续正数序列 {
	public static void main(String[] args) {

		sumNum(9);
	}

	public static void sumNum(int num) {
		if (num < 2) {
			System.out.println("输入数字不合法!");
			return;
		}
		int left = 1;
		int right = 2;
		int sum = left + right;
		int count = 0;// 记录有没有正数序列和
		while (left < (num + 1) / 2) {
			if (sum == num) {
				count++;
				print(left, right);
				right++;
				sum += right;
				sum -= left;
				left++;
			} else if (sum < num) {
				right++;
				sum += right;
			} else {
				sum -= left;
				left++;
			}
		}
		if (count == 0) {
			System.out.println("没有连续正数序列!");
		}
	}

	public static void print(int left, int right) {
		for (int i = left; i <= right; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
