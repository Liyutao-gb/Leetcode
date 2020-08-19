package simple;

import java.util.HashSet;
import java.util.Set;

public class Main0575·ÖÌÇ¹û {
	public static void main(String[] args) {

		System.out.println(new Solution575().distributeCandies(new int[] { 1, 1, 2, 2, 3, 3 }));
	}
}

class Solution575 {
	public int distributeCandies(int[] candies) {
		Set<Integer> set = new HashSet<>();
		for (int i : candies)
			set.add(i);
		if (set.size() >= candies.length / 2) {
			return candies.length / 2;
		}
		return set.size();
	}
}