package middle;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		// 注意，要想改变默认的排列顺序，★不能使用基本类型（int,double, char）
		// 而要使用它们对应的类
		Integer[] a = { 9, 8, 7, 2, 3, 4, 1, 0, 6, 5 };
		// 定义一个自定义类MyComparator的对象
		// Comparator<Integer> cmp = new MyComparator();
		// Arrays.sort(a, cmp);
		Arrays.sort(a, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
//				System.out.print(o1 + " " + o2 + " ");
//				System.out.println(o2 - o1);
				return o2 - o1; // 返回负值就交换顺序
			}
		});
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

//实现Comparator接口,可以自定义多个排列顺序,可以添加自己新new的对象,
//比如可以写一个先按年龄从小到大排序,再按名字排序的compare的重写方法
//Comparator是一个接口，所以这里我们自己定义的类MyComparator要implements该接口
//而不是extends Comparator
//class MyComparator implements Comparator<Integer>{
//  @Override
//  public int compare(Integer o1, Integer o2) {
//      //如果n1小于n2，我们就返回正值，如果n1大于n2我们就返回负值，
//      //这样颠倒一下，就可以实现反向排序了
//      if(o1 < o2) {
//          return 1;
//      }else if(o1 > o2) {
//          return -1;
//      }else {
//          return 0;
//      }
//  }
//}