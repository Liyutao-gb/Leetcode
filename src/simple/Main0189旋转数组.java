package simple;

public class Main0189��ת���� {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		new Solution189().rotate(a, 0);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}

class Solution189 {
	public void rotate(int[] arr, int k) {
		if (k < 0) {
			System.out.println("k����С��0!");
			return;
		}
		k %= arr.length;
		
		// ��תǰ�������
		reverse(arr, 0, arr.length - k - 1);
		// ��ת��������
		reverse(arr, arr.length - k, arr.length - 1);
		// ��ת��������
		reverse(arr, 0, arr.length - 1);
	}

	public void reverse(int[] arr, int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left++] = arr[right];
			arr[right--] = temp;
		}
	}
}