package bitmanipulation;

public class Main {
	public static void main(String[] args) {
		
		int i = Integer.parseInt("10000001", 2);
		System.out.println((byte)i +" " + i);//-127 129
		String s = Integer.toBinaryString(-1);
		System.out.println(s);//����
//		��������Բ������洢��
//		//ԭ�룺10000000000000000000000000000001
//		//���룺11111111111111111111111111111110
//		//���룺11111111111111111111111111111111
	}
}
