package simple;

public class Main0551ѧ�����ڼ�¼�� {
	public static void main(String[] args) {
		
		System.out.println(new Solution551().checkRecord("PPALLL"));
	}
}

class Solution551 {
	public boolean checkRecord(String s) {
		if (s.indexOf("A") == s.lastIndexOf("A") && s.indexOf("LLL") < 0){
			return true;			
		}
		return false;
	}
}