package bitmanipulation;

public class Main {
	public static void main(String[] args) {
		
		int i = Integer.parseInt("10000001", 2);
		System.out.println((byte)i +" " + i);//-127 129
		String s = Integer.toBinaryString(-1);
		System.out.println(s);//补码
//		计算机中以补码来存储的
//		//原码：10000000000000000000000000000001
//		//反码：11111111111111111111111111111110
//		//补码：11111111111111111111111111111111
	}
}
