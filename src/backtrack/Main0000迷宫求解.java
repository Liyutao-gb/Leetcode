package backtrack;

import java.util.Arrays;

public class Main0000�Թ���� {
	public static void main(String[] args) {
		// ��ά����ģ���Թ�
		int[][] map = new int[10][10];
		// ����ǽ��Ϊ1
		for (int i = 0; i < 10; i++) {
			map[0][i] = 1;
			map[9][i] = 1;
		}
		// ����ǽ��Ϊ 1
		for (int i = 0; i < 10; i++) {
			map[i][0] = 1;
			map[i][9] = 1;
		}

		// �ϰ�
		map[1][3] = 1;
		map[1][7] = 1;
		map[2][3] = 1;
		map[2][7] = 1;
		map[3][5] = 1;
		map[3][6] = 1;
		map[4][2] = 1;
		map[4][3] = 1;
		map[4][4] = 1;
		map[5][4] = 1;
		map[6][2] = 1;
		map[6][6] = 1;
		map[7][2] = 1;
		map[7][3] = 1;
		map[7][4] = 1;
		map[7][6] = 1;
		map[7][7] = 1;
		map[8][1] = 1;

		System.out.println("��ǰ��ͼ��");
		for (int[] is : map) {
			System.out.println(Arrays.toString(is));
		}

		setWay(map, 1, 1);

		System.out.println("С���߹��ı�ʶ��ͼ��");
		for (int[] is : map) {
			System.out.println(Arrays.toString(is));
		}
	}

	// 1. i,j ������ (1,1)
	// 2. 0���õ�û�߹�; 1��ǽ; 2��·������;3���õ��Ѿ��߹�,�����߲�ͨ
	public static boolean setWay(int[][] map, int i, int j) {
		if (map[8][8] == 2)
			return true;
		else {
			if (map[i][j] == 0) {
				map[i][j] = 2;
				if (setWay(map, i + 1, j)) {
					return true;
				} else if (setWay(map, i, j + 1)) {
					return true;
				} else if (setWay(map, i - 1, j)) {
					return true;
				} else if (setWay(map, i, j - 1)) {
					return true;
				} else {
					map[i][j] = 1;
					return false;
				}
			} else {
				return false;
			}
		}
	}
}