package simple;

public class Main0605种花问题 {
	public static void main(String[] args) {

		System.out.println(new Solution605().canPlaceFlowers(new int[] {0,0,0,0}, 3));
	}
}

class Solution605 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if (flowerbed.length == 1) {
			if ((flowerbed[0] == 0 && n <= 1) || (flowerbed[0] == 1 && n == 0))
				return true;
			else
				return false;
		}
		if (flowerbed.length == 2) {
			if (flowerbed[0] == 0 && flowerbed[1] == 0) {
				if(n <= 1)
					return true;
			} else if (flowerbed[0] == 0 && flowerbed[1] == 1 || flowerbed[0] == 1 && flowerbed[1] == 0) {
				if (n == 0)
					return true;
			}
			return false;
		}
		//前两位 0 0
		if (flowerbed[0] == 0 && flowerbed[1] == 0){
			flowerbed[0] = 1;
			n--;			
		}
		//有相邻三个0种一朵花,并赋值1
		for (int i = 1; i < flowerbed.length - 2; i++) {
			if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
				flowerbed[i] = 1;
				n--;
			}
		}
		//后两位 0 0
		if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0)
			n--;
		return n <= 0;
	}
}