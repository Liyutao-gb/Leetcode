package stack;

import java.util.Arrays;
import java.util.Stack;

public class MonotoneStackStructure {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 5, 6, 2, 7 };
		int[][] is = getNearLessNoRepeat(arr);
		for (int[] i : is) {
			System.out.println(Arrays.toString(i));
		}
	}

	/**
	 *  �ҵ�ÿһ��iλ����ߺ��ұ������ֵ��arr[i]С����
	 *  ά��һ���Ӷ����װ��Ӵ�С��˳��
	 *  ���ջ�л������֣�˵���ұ��ޱ�ջ������С�����֣���Ϊ -1
	 */
	public static int[][] getNearLessNoRepeat(int[] arr) {
		if (arr == null || arr.length <= 0)
			return new int[][] {};
		
		int[][] res = new int[arr.length][2];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() &&  arr[i] < arr[stack.peek()]) {
				int cur = stack.pop();
				res[cur][0] = stack.isEmpty() ? -1 : stack.peek();
				res[cur][1] = i;
			}
			stack.push(i);
		}
		
		while (!stack.isEmpty()) {
			int cur = stack.pop();
			res[cur][0] = stack.isEmpty() ? -1 : stack.peek();
			res[cur][1] = -1;
		}
		return res;
	}
}