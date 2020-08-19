package middle;

public class Main0011盛最多水的容器 {
	public static void main(String[] args) {

		System.out.println(new Solution11().maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}
}

class Solution11 {
	public int maxArea(int[] height) {
		int max = 0, l = 0, r = height.length - 1;
		while (l < r) {
			max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
			if (height[l] < height[r])
				l++;
			else
				r--;
		}
		return max;
	}
}