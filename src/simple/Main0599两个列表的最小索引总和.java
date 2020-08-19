package simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main0599两个列表的最小索引总和 {
	public static void main(String[] args) {

		String[] s = new Solution599().findRestaurant(
				new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" },
				new String[] { "KFC", "Burger King", "Tapioca Express", "Shogun" });
		System.out.println(Arrays.toString(s));
	}
}

class Solution599 {
	public String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i].equals(list2[j])) {
					map.put(list1[i], j + i);
					break;
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for (Integer i : map.values()) {
			if (i < min)
				min = i;
		}
		String s = "";
		for (String string : map.keySet()) {
			if (min == map.get(string)) {
				s += string + "  ";//因为名字里有空格,因此采用双空格 
			}
		}
		String[] str = s.split("  ");
		return str;
	}
}