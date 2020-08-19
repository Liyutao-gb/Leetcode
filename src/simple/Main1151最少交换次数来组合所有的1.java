package simple;

public class Main1151最少交换次数来组合所有的1 {
	public static void main(String[] args) {

		System.out.println(new Solution1151().minSwaps(new int[] {1,0,1,0,1}));
	}
}

class Solution1151 {
	public int minSwaps(int[] data) {
		int m = 0;
		for (int i : data) {
			if(i == 1)
				m++;
		}
		if(m == 1)
			return 0;
		int count = 0, left = 0, right = data.length - 1;
		while (left <= right) {
			while (data[left] == 1)
				left++;
			while (data[right] == 1)
				right--;
			count++;
			left++;
			right--;
		}
		return count;
	}
}