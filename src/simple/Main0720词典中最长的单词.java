package simple;

import java.util.Arrays;

public class Main0720词典中最长的单词 {
	public static void main(String[] args) {
		
		System.out.println(new Solution720().longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
		
	}
}

class Solution720 {
    public String longestWord(String[] words) {
    	Arrays.sort(words);
    	
    	return "";
    }
}