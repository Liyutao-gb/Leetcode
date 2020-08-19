package simple;
public class Main0172½×³ËºóµÄÁã {
	public static void main(String[] args) {

		System.out.println(new Solution172().trailingZeroes(35));
	}
}

class Solution172 {
	public int trailingZeroes(int n) {
		int sum = 0;
		while(n != 0){
			n /= 5;
			sum += n;
		}
		return sum;
	}
}