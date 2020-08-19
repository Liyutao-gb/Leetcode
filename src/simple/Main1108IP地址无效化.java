package simple;

public class Main1108IP地址无效化 {
	public static void main(String[] args) {
		
		System.out.println(new Solution1108().defangIPaddr("255.100.50.0"));
	}
}

class Solution1108 {
    public String defangIPaddr(String address) {
    	StringBuffer ans = new StringBuffer();
    	for (int i = 0; i < address.length(); i++) {
			if(address.charAt(i) == '.')
				ans.append("[.]");
			else
				ans.append(address.charAt(i));
		}
    	return ans.toString();
    }
}