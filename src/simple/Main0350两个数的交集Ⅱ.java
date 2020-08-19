package simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main0350两个数的交集Ⅱ {
	public static void main(String[] args) {

		int[] res = new Solution350().intersect(new int[] { 4, 9,4, 5 }, new int[] { 9, 4, 9, 8, 4 });
		for (int i : res) {
			System.out.println(i);
		}
	}
}

class Solution350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums1) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
		List<Integer> list = new ArrayList<>();
		for (int i : nums2) {
			if (map.containsKey(i) && map.get(i) > 0) {
				list.add(i);
				map.put(i, map.get(i) - 1);
			}
		}
		int[] res = new int[list.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
		return res;
//		Object[] o = list.toArray();
//		int[] res = new int[o.length];
//		int index = 0;
//		for (Object i : o) {
//			res[index++] = (int) i;
//		}
//		return res;
	}
}