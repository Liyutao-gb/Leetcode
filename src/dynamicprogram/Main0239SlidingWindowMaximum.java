package dynamicprogram;

import java.util.LinkedList;

public class Main0239SlidingWindowMaximum {
	public static void main(String[] args) {
		int[] is = new Solution239().maxSlidingWindow(new int[] { 7, 2, 4 }, 2);
		for (int i : is) {
			System.out.print(i + " ");
		}
	}
}

// 1.ά��һ��˫�����,���е�ͷԪ��Ϊÿ�δ�Ŵ��ڵ����ֵ;
// 2.���arrΪ�գ�ֱ�ӷ��뵱ǰ�±�i;
// 3.���arr��Ϊ��:��1�����nums[list.peek()] > nums[i],����list;
// 				     ��2�����nums[list.peekLast()] < nums[i]ѭ���������е�Ԫ��;
class Solution239 {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k == 0)
			return new int[0];

		int[] arr = new int[nums.length - k + 1];
		LinkedList<Integer> list = new LinkedList<>();

		for (int index = 0, i = 0; i < nums.length; i++) {
			while (!list.isEmpty() && nums[list.peekLast()] < nums[i]) {
				list.pollLast();
			}
			list.add(i);
			if (list.peek() == i - k)
				list.poll();
			if (i >= k - 1)
				arr[index++] = nums[list.peek()];
		}
		return arr;
	}
}