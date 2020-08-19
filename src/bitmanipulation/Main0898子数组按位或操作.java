package bitmanipulation;

import java.util.HashSet;
import java.util.Set;

public class Main0898子数组按位或操作 {
	public static void main(String[] args) {

		System.out.println(new Solution898().subarrayBitwiseORs(new int[] { 1, 2, 3 }));
	}
}

class Solution898 {
	public int subarrayBitwiseORs(int[] A) {
		Set<Integer> ans = new HashSet<>();
		Set<Integer> cur = new HashSet<>();
		cur.add(0);
		for (int x : A) {
			Set<Integer> cur2 = new HashSet<>();
			for (int y : cur)
				cur2.add(x | y);
			cur2.add(x);
			cur = cur2;
			ans.addAll(cur);
		}
		return ans.size();
	}
}