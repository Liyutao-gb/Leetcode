package middle;

import java.util.ArrayList;
import java.util.List;

public class Main0060��k������ {
	public static void main(String[] args) {
		String s = new Solution60().getPermutation(3, 3);
		System.out.println(s);
	}
}

class Solution60 {
	public String getPermutation(int n, int k) {
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++)
			list.add(i);

		// ���� (n-1)!
		int s = 1;
		for (int i = 1; i < n; i++)
			s *= i;

		while (n > 1) {
			int j = k / s;
			k = k % s;
			s = s / --n;
			if (k == 0) {
				sb.append(list.get(j - 1));
				list.remove(j - 1);
				break;
			} else {
				sb.append(list.get(j));
				list.remove(j);
			}
		}

		for (int i = list.size() - 1; i >= 0; i--) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
}