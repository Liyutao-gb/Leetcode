package simple;

//Math.ceil()向上取整   Math.floor()向下取整   Math.round(num) num+0.5向趋于零的方向取整
public class Main0507完美数 {
	public static void main(String[] args) {

		System.out.println(new Solution507().checkPerfectNumber(6));
	}
}

class Solution507 {
	public boolean checkPerfectNumber(int num) {
		if (num == 1)
			return false;
		int n = (int) Math.ceil(Math.sqrt(num));
		int sum = 1;
		for (int i = 2; i < n; i++) {
			if (num % i == 0) {
				sum += (i + num / i);
			}
		}
		return sum == num;
	}
}