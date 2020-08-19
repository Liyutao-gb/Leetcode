package dynamicprogram;

//KMP算法
//★“部分匹配值”就是“前缀”和“后缀”的最长的共有元素的长度		
//	搜索词		A	B	C	D	A	B	D
//	部分匹配表	0	0	0	0	1	2	0
public class KMP {
	public static void main(String[] args) {

		String str1 = "BBC ABCDAB ABCDABCDABDE";
		String str2 = "ABCDABD";
		int[] next = kmpNext(str2);
		int index = kmpSearch(str1, str2, next);
		System.out.println(index);
	}

	// kmp搜索算法
	/**
	 * 
	 * @param str1
	 *            源字符串
	 * @param str2
	 *            str2子串
	 * @param next
	 *            部分匹配表,是子串对应的部分匹配表
	 * @return 如果是-1就是没有匹配到,否则返回第一个匹配的位置
	 */
	public static int kmpSearch(String str1, String str2, int[] next) {
		for (int i = 0, j = 0; i < str1.length(); i++) {
			// KMP算法核心
			while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
				j = next[j - 1];
			}
			if (str1.charAt(i) == str2.charAt(j)) {
				j++;
			}
			if (j == str2.length()) {
				return i - j + 1;
			}
		}
		return -1;
	}

	// 获取到一个字符串(子串)的部分匹配表
	public static int[] kmpNext(String dest) {
		// 创建一个next数组
		int[] next = new int[dest.length()];
		next[0] = 0;// 如果字符串长度为1,部分匹配表就是0
		for (int i = 1, j = 0; i < dest.length(); i++) {
			// KMP算法核心
			while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
				j = next[j - 1];
			}
			if (dest.charAt(i) == dest.charAt(j)) {
				j++;
			}
			next[i] = j;
		}
		return next;
	}
}