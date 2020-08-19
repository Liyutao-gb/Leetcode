package simple;

import java.util.HashMap;
import java.util.Map;

public class Main0884两句话中的不常见单词 {
	public static void main(String[] args) {

		String[] str = new Solution884().uncommonFromSentences("this apple is sweet", "this apple is sour");
		for (String string : str) {
			System.out.println(string);
		}
	}
}

class Solution884 {
	public String[] uncommonFromSentences(String A, String B) {
		Map<String, Integer> map = new HashMap<>();
		for (String a : A.split(" ")) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		for (String b : B.split(" ")) {
			map.put(b, map.getOrDefault(b, 0) + 1);
		}
		String res = "";
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1)
				res += entry.getKey() + " ";
		}
		if (res.equals(""))
			return new String[0];
		return res.split(" ");
	}
}