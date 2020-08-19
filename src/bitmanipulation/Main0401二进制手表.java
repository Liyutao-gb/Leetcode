package bitmanipulation;
import java.util.ArrayList;
import java.util.List;

public class Main0401二进制手表 {
	public static void main(String[] args) {

		System.out.println(new Solution401().readBinaryWatch(1));
//		System.out.println(Integer.bitCount(-1));
	}
}

class Solution401 {
	public List<String> readBinaryWatch(int num) {
		List<String> list = new ArrayList<>();
		for (int h = 0; h < 12; h++) {
			for (int m = 0; m < 60; m++) {
				if(Integer.bitCount(h) + Integer.bitCount(m) == num)
					list.add(h + ":" + (m > 10 ? m : "0" + m));
			}
		}
		return list;
	}
}