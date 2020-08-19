package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main0049×ÖÄ¸ÒìÎ»´Ê·Ö×é {
	public static void main(String[] args) {
		List<List<String>> list = new Solution49()
				.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
		for (List<String> list2 : list) {
			System.out.println(list2);
		}
	}
}

class Solution49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String s : strs) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String str = String.valueOf(c);
			if (!map.containsKey(str)) {
				map.put(str, new ArrayList<>());
			}
			map.get(str).add(s);
		}
		return new ArrayList<>(map.values());
	}
}