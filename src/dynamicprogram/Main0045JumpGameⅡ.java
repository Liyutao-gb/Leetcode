package dynamicprogram;

public class Main0045JumpGame�� {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 1, 4};
		System.out.println(new Solution45().jump(arr));
	}
}

// ÿ���ڿ�����Χ��ѡ�����ʹ�����ĸ�Զ��λ��
class Solution45 {
	public int jump(int[] nums) {
		int end = 0;
		int maxPosition = 0;
		int steps = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			// ����������Զ��
			maxPosition = Math.max(maxPosition, nums[i] + i);
			if (i == end) { // �����߽磬���±߽磬���Ҳ�����һ
				end = maxPosition;
				steps++;
			}
		}
		return steps;
	}
}