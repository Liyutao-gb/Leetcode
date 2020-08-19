package simple;

public class Main0122买卖股票的最佳时机Ⅱ {
	public static void main(String[] args) {

		System.out.println(new Solution122().maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
	}
}

class Solution122 {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				maxProfit += prices[i] - prices[i - 1];
			}
		}
		return maxProfit;
	}
}