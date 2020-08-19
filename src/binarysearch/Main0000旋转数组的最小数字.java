package binarysearch;

//��ת��������Сֵ
public class Main0000��ת�������С���� {
	public static void main(String[] args) {
		int[] arr = { 5, 0, 1, 1, 1 };
		System.out.println(searchMin(arr, 0, arr.length - 1));
	}

	public static int searchMin(int[] arr, int left, int right) {
		if (arr[left] < arr[right]) // ��������
			return arr[0];

		while (left < right) {
			int mid = left + (right - left) / 2;	// right - 1 == left��ζ������ָ������
			if (arr[mid] > arr[right] && left + 1 == right)
				return arr[right];
			else if (arr[mid] >= arr[left])
				left = mid;
			else if (arr[mid] <= arr[right])
				right = mid;
		}
		throw null;
	}
}