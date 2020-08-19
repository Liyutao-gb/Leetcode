package simple;

public class Main0860ÄûÃÊË®ÕÒÁã {
	public static void main(String[] args) {

		System.out.println(new Solution860().lemonadeChange(new int[] { 5, 5, 5, 10, 20 }));
	}
}

class Solution860 {
	public boolean lemonadeChange(int[] bills) {
		int countFive = 0, countTen = 0;
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				countFive++;
			} else if (bills[i] == 10) {
				countTen++;
				if (countFive >= 1) {
					countFive--;
				} else
					return false;
			} else if (bills[i] == 20) {
				if (countFive >= 1 && countTen >= 1) {
					countFive--;
					countTen--;
				} else if (countFive >= 3) {
					countFive -= 3;
				} else
					return false;
			}
		}
		return true;
	}
}