package simple;

import java.util.HashMap;
import java.util.Map;

public class Main0819最常见的单词 {
	public static void main(String[] args) {

		System.out.println(new Solution819().mostCommonWord("Bob hit a ball, the hit BALL flew far ,after it was hit..",
				new String[] { "hit" }));
	}
}

class Solution819 {
	public String mostCommonWord(String paragraph, String[] banned) {
		paragraph = paragraph.toLowerCase();
		// paragraph = paragraph.toLowerCase().replaceAll("[,|.|!|?|;|']"," ");
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < paragraph.length(); i++) {
			if (paragraph.charAt(i) >= 'a' && paragraph.charAt(i) <= 'z' || paragraph.charAt(i) == ' ')
				s.append(paragraph.charAt(i));
			else
				s.append(" ");
		}
		paragraph = s.toString();
		for (int i = 0; i < banned.length; i++) {
			paragraph = paragraph.replaceAll(banned[i], "");
		}
		Map<String, Integer> map = new HashMap<>();
		String[] split = paragraph.split(" ");
		for (String str : split) {
			str = str.trim();
			if (str.equals(""))
				continue;
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		String res = "";
		int maxCount = 0;
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() > maxCount) {
				maxCount = m.getValue();
				res = m.getKey();
			}
		}
		return res;
	}
}