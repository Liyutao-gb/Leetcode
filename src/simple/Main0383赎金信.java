package simple;

public class Main0383Êê½ðÐÅ {
	public static void main(String[] args) {

		System.out.println(new Solution383().canConstruct("fihjjjjei"
				,"hjibagacbhadfaefdjaeaebgi"));
	}
}

class Solution383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] ran = new int[26];
		for (char c : ransomNote.toCharArray())
			ran[c - 'a']++;
		int[] mag = new int[26];
		for (char c : magazine.toCharArray())
			mag[c - 'a']++;
		for (int i = 0; i < ran.length; i++) {
			if (ran[i] > mag[i])
				return false;			
		}
		return true;
	}
}