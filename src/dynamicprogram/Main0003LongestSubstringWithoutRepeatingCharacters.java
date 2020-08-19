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
 *  ��HashMap����
 *   1. ��¼ÿһ����ÿһ���ַ���β������£�����ظ��ַ��Ӵ����ȵ����ֵ��
 *   2. index[i]��ֵ��ʾ֮ǰ�ı��������һ�γ���str[i]�ַ���λ�ã�
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
