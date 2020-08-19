package simple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main0438找到字符串中所有字母异位词 {
	public static void main(String[] args) {

		System.out.println(new Solution438().findAnagrams("cbaebabacd", "abc"));
	}
}

class Solution438 {
	public List<Integer> findAnagrams(String s, String p) {
		int[] pp = new int[26];
		for (int j = 0; j < p.length(); j++) {
			pp[p.charAt(j) - 'a']++;
		}
		List<Integer> list = new ArrayList<>();
		int m = p.length();
		loop: for (int i = 0; i <= s.length() - m; i++) {
			int[] ss = new int[26];
			String str = s.substring(i, i + m);
			for (int j = 0; j < str.length(); j++) {
				ss[str.charAt(j) - 'a']++;
			}
			for (int j = 0; j < ss.length; j++) {
				if (ss[j] != pp[j]) {
					continue loop;
				}
			}
			list.add(i);
		}
		return list;
	}
}

class Solution00438 {
	public List<Integer> findAnagrams(String s, String p) {
		ArrayList<Integer> result = new ArrayList<>();

		int lens = s.length();
		int lenp = p.length();

		int[] indexs = new int[26];
		int[] indexp = new int[26];

		for (int i = 0; i < lenp; i++) {
			indexp[p.charAt(i) - 'a']++;
		}
		for (int i = 0; i < lens; i++) {
			indexs[s.charAt(i) - 'a']++;
			if (i == lenp - 1) {
				if (Arrays.equals(indexs, indexp)) {
					result.add(i - lenp + 1);
				}
			} else if (i >= lenp) {
				indexs[s.charAt(i - lenp) - 'a']--;
				if (Arrays.equals(indexs, indexp)) {
					result.add(i - lenp + 1);
				}
			}
		}
		return result;
	}
}

class Solution0438 {
	public List<Integer> findAnagrams(String s, String p) {
		if (s.length() < p.length()) {
			return new ArrayList<>();
		}
		char[] sc = s.toCharArray();
		char[] pc = p.toCharArray();
		// hash
		int[] hash = new int[26];
		for (int i = 0; i < p.length(); i++) {
			hash[pc[i] - 'a']++;
		}
		List<Integer> res = new ArrayList<>();
		// 统计符合hash中的元素个数
		int count = 0;
		// 窗口左端
		int l = 0;
		for (int r = 0; r < s.length(); r++) {
			// 更新新元素在hash中的数量
			hash[sc[r] - 'a']--;
			if (hash[sc[r] - 'a'] >= 0) {
				count++;
			}
			if (r > p.length() - 1) {
				hash[sc[l] - 'a']++;

				if (hash[sc[l] - 'a'] > 0) {
					count--;
				}
				l++;
			}
			if (count == p.length()) {
				res.add(l);
			}
		}
		return res;
	}
}