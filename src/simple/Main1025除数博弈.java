package simple;

public class Main1025�������� {
	public static void main(String[] args) {
		System.out.println(new Solution1025().divisorGame(2));
	}
}

class Solution1025 {
    public boolean divisorGame(int N) {
        return N % 2 == 0;
    }
}