package dynamicprogram;

public class Main0121BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		System.out.println(new Solution121().maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
	}
}

class Solution121 {
	public int maxProfit(int prices[]) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if(prices[i] < minPrice){
				minPrice = prices[i];// ��Сֵ
			}else if(prices[i] - minPrice > maxProfit){
				maxProfit = prices[i] - minPrice;// ��Сֵ��Ĳ�ֵ������� 
			}
		}
		return maxProfit;
	}
}