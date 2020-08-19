package simple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main0187÷ÿ∏¥DNA–Ú¡– {
	public static void main(String[] args) {

		System.out.println(new Solution187().findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
	}
}

class Solution187 {
	public List<String> findRepeatedDnaSequences(String s) {
		List<String> list = new ArrayList<>();
		if (s.length() < 10)
			return list;
		
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		for (int i = 0; i <= s.length() - 10; i++) {
			String str = s.substring(i, i + 10);
			if (set1.contains(str)) {
				set2.add(str);
			}
			set1.add(str);
		}
		list.addAll(set2);
		
		return list;
	}
}