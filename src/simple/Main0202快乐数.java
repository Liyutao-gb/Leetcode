package simple;

public class Main0202快乐数 {
	public static void main(String[] args) {

		System.out.println(new Solution202().isHappy(19));
	}
}

// 不快乐数会进入4-16-37-58-89-145-42-20-4的循环中
class Solution0202 {
	public boolean isHappy(int n) {
		if (n == 1) {
			return true;
		}
		int count = 0;
		while (count <= 10) { // 循环十次以上肯定不快乐
			int happy = 0;
			while (n != 0) { // happy是各位的平方和
				happy += (int) Math.pow(n % 10, 2);
				n /= 10;
			}
			count++;
			n = happy;
			if (happy == 1) {
				return true;
			}
		}
		return false;
	}
}

class Solution202 {
	public boolean isHappy(int n) { // 19
		int sum = 0;
		while (true) {
			while (n > 0) {
				int m = n % 10;
				sum += m * m;
				n /= 10;
			}
			if (sum == 4 || sum == 20)
				return false;
			else if (sum == 1)
				return true;
			else {
				n = sum;
				sum = 0;
			}
		}
	}
}