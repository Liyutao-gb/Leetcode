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

// 1.维护一个双向队列,队列的头元素为每次存放窗口的最大值;
// 2.如果arr为空，直接放入当前下标i;
// 3.如果arr不为空:（1）如果nums[list.peek()] > nums[i],放入list;
// 				     （2）如果nums[list.peekLast()] < nums[i]循环弹出队列的元素;
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