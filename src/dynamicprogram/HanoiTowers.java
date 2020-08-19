package dynamicprogram;

//分治 + 递归
public class HanoiTowers {
	public static void main(String[] args) {
		hanoitower(3, 'A', 'B', 'C');
	}
	
	// A塔 -> C塔，移动过程借助 B塔
	public static void hanoitower(int num, char A, char B, char C) {
		if (num == 1) {
			System.out.println("第1个盘从" + A + "->" + C);
		} else {
			// 1. 先把 A塔 的 1 ~ N-1层  从A -> B,移动过程用到 C 塔
			hanoitower(num - 1, A, C, B);
			// 2. 再将 N塔 -> C
			System.out.println("第" + num + "个盘从" + A + "->" + C);
			// 3. 把B塔的 1 ~ N-1层 从B -> C , 移动过程用到 A 塔
			hanoitower(num - 1, B, A, C);
		}
	}
}