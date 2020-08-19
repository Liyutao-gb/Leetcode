package string;

public class StatisticalString {
	public static void main(String[] args) {
		String s = "aaabbadddffc";
		String str = statisticalString(s);
		System.out.println(str);
	}
	
	public static String statisticalString(String s) {
		if(s == null || s.length() <= 0)
			return "";
		
		char[] c = s.toCharArray();
		int num = 1; 
		StringBuffer sb = new StringBuffer();
		sb.append(c[0]);
		for (int i = 1; i < c.length; i++) {
			if (c[i] != c[i - 1]) {
				sb.append("_" + String.valueOf(num)+"_").append(c[i]);
				num = 1;
			} else {
				num++;
			}
		}
		
		return sb.append("_" + String.valueOf(num)).toString();
	}
	
}
