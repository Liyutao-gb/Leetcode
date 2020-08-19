package simple;

import java.util.LinkedList;
import java.util.Queue;

public class Main0933最近的请求次数 {
	public static void main(String[] args) {

	}
}

class RecentCounter {
	Queue<Integer> q;

	public RecentCounter() {
        q = new LinkedList<>();
    }

	public int ping(int t) {
		q.add(t);
		while (q.peek() < t - 3000)
			q.poll();
		return q.size();
	}
}