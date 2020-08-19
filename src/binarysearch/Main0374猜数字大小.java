package binarysearch;

public class Main0374²ÂÊı×Ö´óĞ¡ {
	public static void main(String[] args) {

		System.out.println(new Solution0374().guessNumber(10));
	}
}
/*
 * The guess API is defined in the parent class GuessGame.
 * 
 * @param num, your guess
 * 
 * @return -1 if my number is lower, 1 if my number is higher, otherwise return
 * 0 int guess(int num);
 */

class Solution374 extends GuessGame {
	public int guessNumber(int n) {
		int low = 1, high = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int res = guess(mid);
			if (res == 0)
				return mid;
			else if (res < 0)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}

class Solution0374 extends GuessGame {
    public int guessNumber(int n) {
        for (int i = 1; i < n; i++)
            if (guess(i) == 0)
                return i;
        return n;
    }
}

class GuessGame {
	private static int NUM = 6;

	int guess(int num) {
		if (num == NUM) {
			return 0;
		}
		if (num < NUM) {
			return 1;
		}
		return -1;
	}
}