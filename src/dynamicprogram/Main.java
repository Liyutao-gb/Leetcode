package dynamicprogram;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		System.out.println(search(arr, 6));//没有此数，l下标会指向应该存放的下标位置
	}
	
	public static int search(int[] arr, int target){
		int l = 0;
		int h = arr.length - 1;
		while(l <= h){
			int mid = (l + h) / 2;
			if(arr[mid] < target){
				l = mid + 1;
			}else if(arr[mid] > target){
				h = mid - 1;
			}else {
				return mid;
			}
		}
		return l;
	}
}
