package stack;

import java.util.Stack;

public class Main0042����ˮ {
	public static void main(String[] args) {
		System.out.println(new Solution0042().trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
	}
}

// ջ
class Solution000042 {
	public int trap(int[] height) {
		int sum = 0, cur = 0;
		Stack<Integer> stack = new Stack<>();
		while (cur < height.length) {
			// ���ջ���ղ��ҵ�ǰָ��ĸ߶ȴ���ջ���߶Ⱦ�һֱѭ��
			while (!stack.empty() && height[cur] > height[stack.peek()]) {
				int h = height[stack.peek()]; // ȡ��Ҫ��ջ��Ԫ��
				stack.pop(); // ��ջ
				if (stack.empty()) { // ջ�վͳ�ȥ
					break;
				}
				int distance = cur - stack.peek() - 1; // ����ǽ֮ǰ�ľ��롣
				int min = Math.min(height[stack.peek()], height[cur]);
				sum = sum + distance * (min - h);
			}
			stack.push(cur); // ��ǰָ���ǽ��ջ
			cur++; // ָ�����
		}
		return sum;
	}
}

// ˫ָ��
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

// ��̬�滮
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

// ������
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

// ������
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