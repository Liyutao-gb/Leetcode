package middle;

public class Main0029两数相除 {
	public static void main(String[] args) {
		
	}
}

class Solution29 {
	public int divide(int dividend, int divisor) {
		if (divisor == 0)
			return -1;
		if (dividend == 0)
			return 0;
		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;
//		 符号位的处理
		boolean negetive = (dividend ^ divisor) < 0;
		/** div_count 是当前divisor_tmp相对于divisor的倍数 */
		int res = 0, div_count = 1;
		/** 因为值溢出之后边界问题处理太繁琐了，直接将数值转为long省去麻烦 */
		long dividend_tmp = Math.abs((long) dividend);
		long divisor_tmp = Math.abs((long) divisor);

		/** 按标准的二分查找代码模板写的 */
		while (dividend_tmp >= divisor_tmp) {
			dividend_tmp -= divisor_tmp;
			res += div_count;

			if (dividend_tmp < Math.abs(divisor))
				break;
			/** divisor_tmp无法倍增时，就将其初始化为divisor绝对值，重新开始下一轮倍增 */
			if (dividend_tmp - divisor_tmp < divisor_tmp) {
				divisor_tmp = Math.abs(divisor);
				div_count = 1;
				continue;
			}
			/** 不断倍增divisor_tmp直到和dividend_tmp一样大 */
			divisor_tmp += divisor_tmp;
			div_count += div_count;
		}
		return negetive ? 0 - res : res;
	}
}