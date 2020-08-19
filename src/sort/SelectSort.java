package sort;

//选择排序 2000ms
//平均时间复杂度：O(n²) 最好：O(n²) 最坏：O(n²)  空间复杂度：O(1)  不稳定
public class SelectSort {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 0, 8, 5, 1, 3, 9, 6, 7 };
		selectSort(arr);
		print(arr);

		// int[] arr = new int[80000];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = new Random().nextInt(100000);
		// }
		//
		// long l = System.currentTimeMillis();
		// selectSort(arr);
		// long m = System.currentTimeMillis();
		//
		// System.out.println(m - l);

	}

	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minPos = i;
			for (int j = i + 1; j < arr.length; j++) {
				minPos = arr[minPos] > arr[j] ? j : minPos;
			}
			swap(arr, i, minPos);
		}
	}

	public static void swap(int[] arr, int i, int minPos) {
		int temp = arr[i];
		arr[i] = arr[minPos];
		arr[minPos] = temp;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
