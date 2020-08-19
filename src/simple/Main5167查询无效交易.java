package simple;

import java.util.ArrayList;
import java.util.List;

public class Main5167查询无效交易 {
	public static void main(String[] args) {

		List<String> list = new Solution5167()
				.invalidTransactions(new String[] { "alice,20,800,mtv", "alice,50,100,beijing" });
		for (String s : list) {
			System.out.println(s);
		}
	}
}

class Solution5167 {
	public List<String> invalidTransactions(String[] transactions) {
		List<String> list = new ArrayList<>();
		
		String[] name = new String[transactions.length];
		int[] time = new int[transactions.length];
		int[] count = new int[transactions.length];
		String[] city = new String[transactions.length];
		
		for (int i = 0; i < transactions.length; i++) {
			String[] split = transactions[i].split(",");
			name[i] = split[0];
			time[i] = Integer.parseInt(split[1]);
			count[i] = Integer.parseInt(split[2]);
			city[i] = split[3];
		}
		
		for (int i = 0; i < transactions.length; i++) {
			if (count[i] > 1000) {
				list.add(transactions[i]);
			} else {
				for (int j = 0; j < transactions.length; j++) {
					if (i != j && name[i].equals(name[j]) && !city[i].equals(city[j])
							&& Math.abs(time[j] - time[i]) <= 60) {
						list.add(transactions[i]);
						break;
					}
				}
			}
		}
		return list;
	}
}