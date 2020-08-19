package simple;

import java.util.ArrayList;
import java.util.List;

public class Main0728×Ô³ýÊý {
	public static void main(String[] args) {

		System.out.println(new Solution728().selfDividingNumbers(1, 22));
	}
}

class Solution728 {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		while (left <= right) {
			if (isVaile(left)) {
				list.add(left);
			}
			left++;
		}
		return list;
	}

	public boolean isVaile(int left) {
		int num = left;
		while (num != 0) {
			int temp = num % 10;
			if (temp == 0 || left % temp != 0) {
				return false;
			}
			num /= 10;
		}
		return true;
	}
}