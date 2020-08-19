package stack;

import java.util.Stack;

public class Main0042接雨水 {
	public static void main(String[] args) {
		System.out.println(new Solution0042().trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
	}
}

// 栈
class Solution000042 {
	public int trap(int[] height) {
		int sum = 0, cur = 0;
		Stack<Integer> stack = new Stack<>();
		while (cur < height.length) {
			// 如果栈不空并且当前指向的高度大于栈顶高度就一直循环
			while (!stack.empty() && height[cur] > height[stack.peek()]) {
				int h = height[stack.peek()]; // 取出要出栈的元素
				stack.pop(); // 出栈
				if (stack.empty()) { // 栈空就出去
					break;
				}
				int distance = cur - stack.peek() - 1; // 两堵墙之前的距离。
				int min = Math.min(height[stack.peek()], height[cur]);
				sum = sum + distance * (min - h);
			}
			stack.push(cur); // 当前指向的墙入栈
			cur++; // 指针后移
		}
		return sum;
	}
}

// 双指针
class Solution00042 {
	public int trap(int[] height) {
		int ans = 0;
		int max_left = 0, max_right = 0;
		int left = 1, right = height.length - 2;
		for (int i = 1; i < height.length - 1; i++) {
			if (height[left - 1] < height[right + 1]) {
				max_left = Math.max(max_left, height[left - 1]);
				if (max_left > height[left]) {
					ans += max_left - height[left];
				}
				left++;
			} else {
				max_right = Math.max(max_right, height[right + 1]);
				if (max_right > height[right]) {
					ans += max_right - height[right];
				}
				right--;
			}
		}
		return ans;
	}
}

// 动态规划
class Solution0042 {
	public int trap(int[] height) {
		int ans = 0;
		int[] max_left = new int[height.length];
		int[] max_right = new int[height.length];
		for (int i = 1; i < height.length; i++) {
			max_left[i] = Math.max(max_left[i - 1], height[i - 1]);
		}
		for (int i = height.length - 2; i >= 0; i--) {
			max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
		}
		for (int i = 1; i < height.length - 1; i++) {
			if (height[i] < max_left[i] && height[i] < max_right[i])
				ans += Math.min(max_left[i], max_right[i]) - height[i];
		}
		return ans;
	}
}

// 按列求
class Solution042 {
	public int trap(int[] height) {
		int ans = 0;
		for (int i = 1; i < height.length - 1; i++) {
			int max_left = 0;
			for (int j = 0; j < i; j++) {
				if (height[j] > max_left)
					max_left = height[j];
			}
			int max_right = 0;
			for (int j = i + 1; j < height.length; j++) {
				if (height[j] > max_right)
					max_right = height[j];
			}
			if (height[i] < max_left && height[i] < max_right)
				ans += Math.min(max_left, max_right) - height[i];
		}
		return ans;
	}
}

// 按行求
class Solution42 {
	public int trap(int[] height) {
		int ans = 0, max_val = Integer.MIN_VALUE;
		for (int i = 0; i < height.length; i++) {
			if (height[i] > max_val)
				max_val = height[i];
		}
		for (int i = 1; i <= max_val; i++) {
			int temp = -1;
			for (int j = 0; j < height.length; j++) {
				if (height[j] >= i && temp != -1)
					ans += j - temp - 1;
				if (height[j] >= i)
					temp = j;
			}
		}
		return ans;
	}
}