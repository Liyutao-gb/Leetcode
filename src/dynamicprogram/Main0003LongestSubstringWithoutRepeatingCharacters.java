package dynamicprogram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main0003LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		System.out.println(new Solution3().lengthOfLongestSubstring("abcdcoia"));
	}
}

/**
 *  和HashMap类似
 *   1. 记录每一个以每一个字符结尾的情况下，最长无重复字符子串长度的最大值；
 *   2. index[i]的值表示之前的遍历中最近一次出现str[i]字符的位置；
 */
class Solution3 {
	public int lengthOfLongestSubstring(String s) {
		int[] index = new int[128];

		int ans = 0;
		int preIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			preIndex = Math.max(preIndex, index[s.charAt(i)]);
			ans = Math.max(ans, i - preIndex + 1);
			index[s.charAt(i)] = i + 1;
		}
		return ans;
	}
}

class Solution003 {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() <= 0)
			return 0;

		int[] arr = new int[128];
		Arrays.fill(arr, -1);

		int maxLength = 0;
		int preIndex = -1;
		for (int i = 0; i < s.length(); i++) {
			preIndex = Math.max(preIndex, arr[s.charAt(i)]);
			maxLength = Math.max(maxLength, i - preIndex);
			arr[s.charAt(i)] = i;
		}
		return maxLength;
	}
}

class Solution03 {
	public int lengthOfLongestSubstring(String s) {
		int ans = 0;
		Map<Character, Integer> map = new HashMap<>();

		int preIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				preIndex = Math.max(map.get(s.charAt(i)), preIndex); 
			}
			ans = Math.max(ans, i - preIndex + 1);
			map.put(s.charAt(i), i + 1);
		}
		return ans;
	}
}
