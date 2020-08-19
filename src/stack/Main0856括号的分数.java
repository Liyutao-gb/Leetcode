package stack;

import java.util.Stack;

public class Main0856À¨ºÅµÄ·ÖÊý {
	public static void main(String[] args) {
		System.out.println(new Solution856().scoreOfParentheses("(()(()))"));
	}
}

class Solution856 {
	public int scoreOfParentheses(String S) {	//[0, 0] (
		Stack<Integer> stack = new Stack<>();	//[0, 0, 0] ((
		stack.push(0);							//[0, 1] (()
												//[0, 1, 0] (()(
		for (char c : S.toCharArray()) {		//[0, 1, 0, 0] (()((
			if (c == '(')						//[0, 1, 1] (()(()
				stack.push(0);					//[0, 3] (()(())
			else {								//[6] (()(()))
				int v = stack.pop();
				int w = stack.pop();
				stack.push(w + Math.max(2 * v, 1));
			}
		}
		return stack.pop();
	}
}

class Solution0856 {
	public int scoreOfParentheses(String S) {
		int ans = 0, bal = 0;
		for (int i = 0; i < S.length(); ++i) {
			if (S.charAt(i) == '(') {
				bal++;
			} else {
				bal--;
				if (S.charAt(i - 1) == '(')
					ans += 1 << bal;
			}
		}
		return ans;
	}
}

class Solution00856 {
    public int scoreOfParentheses(String S) {
        return F(S, 0, S.length());
    }

    public int F(String S, int i, int j) {
        //Score of balanced string S[i:j]
        int ans = 0, bal = 0;

        // Split string into primitives
        for (int k = i; k < j; ++k) {
            bal += S.charAt(k) == '(' ? 1 : -1;
            if (bal == 0) {
                if (k - i == 1) ans++;
                else ans += 2 * F(S, i+1, k);
                i = k+1;
            }
        }
        return ans;
    }
}