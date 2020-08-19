package simple;

import java.util.HashSet;
import java.util.Set;

public class Main0888公平的糖果交换 {
	public static void main(String[] args) {

		int[] is = new Solution888().fairCandySwap(new int[] { 1, 2, 5 }, new int[] { 2, 4 });
		for (int i : is) {
			System.out.println(i);
		}
	}
}

class Solution888 {
	public int[] fairCandySwap(int[] A, int[] B) {
		int sumA = 0, sumB = 0;

		for (int i : A)
			sumA += i;
		for (int i : B)
			sumB += i;

		Set<Integer> setB = new HashSet<>();
		for (int i : B)
			setB.add(i);

		int del = (sumA - sumB) / 2;
		for (int i : A) {
			if (setB.contains(i - del)) {
				return new int[] { i, del };
			}
		}
		throw null;
	}
}