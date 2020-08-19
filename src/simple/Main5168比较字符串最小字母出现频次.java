package simple;

public class Main5168比较字符串最小字母出现频次 {
	public static void main(String[] args) {
		int[] a = new Solution5168().numSmallerByFrequency(new String[] { "bbb", "cc" },
				new String[] { "a", "aa", "aaa", "aaaa" });
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}

class Solution5168 {
	public int[] numSmallerByFrequency(String[] queries, String[] words) {
		int[] a = new int[queries.length];
		int[] b = new int[words.length];
		int[] arr;
		for (int i = 0; i < queries.length; i++) {
			arr = new int[26];
			for (int j = 0; j < queries[i].length(); j++) {
				arr[queries[i].charAt(j) - 'a']++;
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != 0) {
					a[i] = arr[j];
					break;
				}
			}
		}
		for (int i = 0; i < words.length; i++) {
			arr = new int[26];
			for (int j = 0; j < words[i].length(); j++) {
				arr[words[i].charAt(j) - 'a']++;
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != 0) {
					b[i] = arr[j];
					break;
				}
			}
		}
		int[] res = new int[queries.length];
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i] < b[j])
					count++;
			}
			res[i] = count;
		}
		return res;
	}
}