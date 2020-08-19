package simple;
import java.util.HashMap;
import java.util.Map;

public class Main0290���ʹ��� {
	public static void main(String[] args) {

		System.out.println(new Solution0290().wordPattern("abba", "dog dog dog dog"));
	}
}

class Solution0290 {
	public boolean wordPattern(String pattern, String str) {
		String[] s = str.split(" ");
		if (s.length != pattern.length())
			return false;
		Map<Character, String> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			if (map.containsKey(pattern.charAt(i))) {
				if (!map.get(pattern.charAt(i)).equals(s[i])) {
					return false;
				}
			} else if (!map.containsKey(pattern.charAt(i))) {
				if (map.containsValue(s[i])) {
					return false;
				}
				map.put(pattern.charAt(i), s[i]);
			}
		}
		return true;
	}
}