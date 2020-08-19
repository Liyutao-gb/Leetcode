package binarysearch;

public class Main0744寻找比目标字母大的最小字母 {
	public static void main(String[] args) {

		System.out.println(new Solution744().nextGreatestLetter(new char[] { 'e', 'e', 'e','n' }, 'e'));
	}
}

class Solution744 {
	public char nextGreatestLetter(char[] letters, char target) {
		if (target < letters[0] || target >= letters[letters.length - 1])
			return letters[0];
		
		int low = 0, high = letters.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (low == high - 1)
				break;
			else if (letters[mid] <= target)
				low = mid;
			else
				high = mid;
		}
		return letters[high];
	}
}