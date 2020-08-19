package binarysearch;

public class Main0034�����������в���Ԫ�صĵ�һ�������һ��λ�� {
	public static void main(String[] args) {
		int[] is = new Solution34().searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8);
		for (int i : is) {
			System.out.print(i + " ");
		}
	}
}

class Solution34 {
	public int[] searchRange(int[] nums, int target) {
		int[] ans = { -1, -1 };
		
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] > target)
				right = mid - 1;
			else if (nums[mid] < target)
				left = mid + 1;
			else {
				int l = mid, r = mid;
				ans[0] = l;
				ans[1] = r;
				while (l > 0 && nums[l] == nums[l - 1]) {
					ans[0] = l - 1;
					l--;
				}
				while (r < nums.length - 1 && nums[r] == nums[r + 1]) {
					ans[1] = r + 1;
					r++;
				}
				break;
			}
		}
		return ans;
	}
}