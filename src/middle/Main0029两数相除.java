package middle;

public class Main0029������� {
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
//		 ����λ�Ĵ���
		boolean negetive = (dividend ^ divisor) < 0;
		/** div_count �ǵ�ǰdivisor_tmp�����divisor�ı��� */
		int res = 0, div_count = 1;
		/** ��Ϊֵ���֮��߽����⴦��̫�����ˣ�ֱ�ӽ���ֵתΪlongʡȥ�鷳 */
		long dividend_tmp = Math.abs((long) dividend);
		long divisor_tmp = Math.abs((long) divisor);

		/** ����׼�Ķ��ֲ��Ҵ���ģ��д�� */
		while (dividend_tmp >= divisor_tmp) {
			dividend_tmp -= divisor_tmp;
			res += div_count;

			if (dividend_tmp < Math.abs(divisor))
				break;
			/** divisor_tmp�޷�����ʱ���ͽ����ʼ��Ϊdivisor����ֵ�����¿�ʼ��һ�ֱ��� */
			if (dividend_tmp - divisor_tmp < divisor_tmp) {
				divisor_tmp = Math.abs(divisor);
				div_count = 1;
				continue;
			}
			/** ���ϱ���divisor_tmpֱ����dividend_tmpһ���� */
			divisor_tmp += divisor_tmp;
			div_count += div_count;
		}
		return negetive ? 0 - res : res;
	}
}