package middle;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		// ע�⣬Ҫ��ı�Ĭ�ϵ�����˳�򣬡ﲻ��ʹ�û������ͣ�int,double, char��
		// ��Ҫʹ�����Ƕ�Ӧ����
		Integer[] a = { 9, 8, 7, 2, 3, 4, 1, 0, 6, 5 };
		// ����һ���Զ�����MyComparator�Ķ���
		// Comparator<Integer> cmp = new MyComparator();
		// Arrays.sort(a, cmp);
		Arrays.sort(a, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
//				System.out.print(o1 + " " + o2 + " ");
//				System.out.println(o2 - o1);
				return o2 - o1; // ���ظ�ֵ�ͽ���˳��
			}
		});
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

//ʵ��Comparator�ӿ�,�����Զ���������˳��,��������Լ���new�Ķ���,
//�������дһ���Ȱ������С��������,�ٰ����������compare����д����
//Comparator��һ���ӿڣ��������������Լ��������MyComparatorҪimplements�ýӿ�
//������extends Comparator
//class MyComparator implements Comparator<Integer>{
//  @Override
//  public int compare(Integer o1, Integer o2) {
//      //���n1С��n2�����Ǿͷ�����ֵ�����n1����n2���Ǿͷ��ظ�ֵ��
//      //�����ߵ�һ�£��Ϳ���ʵ�ַ���������
//      if(o1 < o2) {
//          return 1;
//      }else if(o1 > o2) {
//          return -1;
//      }else {
//          return 0;
//      }
//  }
//}