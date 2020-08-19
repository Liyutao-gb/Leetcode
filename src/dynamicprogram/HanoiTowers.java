package dynamicprogram;

//���� + �ݹ�
public class HanoiTowers {
	public static void main(String[] args) {
		hanoitower(3, 'A', 'B', 'C');
	}
	
	// A�� -> C�����ƶ����̽��� B��
	public static void hanoitower(int num, char A, char B, char C) {
		if (num == 1) {
			System.out.println("��1���̴�" + A + "->" + C);
		} else {
			// 1. �Ȱ� A�� �� 1 ~ N-1��  ��A -> B,�ƶ������õ� C ��
			hanoitower(num - 1, A, C, B);
			// 2. �ٽ� N�� -> C
			System.out.println("��" + num + "���̴�" + A + "->" + C);
			// 3. ��B���� 1 ~ N-1�� ��B -> C , �ƶ������õ� A ��
			hanoitower(num - 1, B, A, C);
		}
	}
}