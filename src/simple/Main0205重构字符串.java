package simple;
import java.util.HashMap;
import java.util.Map;

public class Main0205ÖØ¹¹×Ö·û´® {
	public static void main(String[] args) {
		
		System.out.println(new Solution205().isIsomorphic("egg", "add"));
	}
}

class Solution205 {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				if (map.containsValue(t.charAt(i))) {
					return false;
				}
				map.put(s.charAt(i), t.charAt(i));
			} else {
				if (map.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
}