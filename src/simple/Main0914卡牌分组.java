package simple;

import java.util.HashMap;
import java.util.Map;

public class Main0914¿¨ÅÆ·Ö×é {
	public static void main(String[] args) {

		System.out.println(new Solution914().hasGroupsSizeX(new int[] { 1,2,3,4,4,3,2,1 }));
	}
}

class Solution914 {
	public boolean hasGroupsSizeX(int[] deck) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i : deck) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}

		int max = 0;
		for (int i : map.values()) {
			if (i > max)
				max = i;
		}
		
		loop: for (int i = 2; i <= max; i++) {
			for (int n : map.values()) {
				if (n % i != 0)
					continue loop;
			}
			return true;
		}

		return false;
	}
}