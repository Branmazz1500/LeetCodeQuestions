package FlightQuestions;

import java.util.*;

public class PerfectSquares {
//Given a positive integer n, find the
//least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

	public static int numSquares(int n) {
		int nums = 1;
		Queue<Integer> queue = new LinkedList<Integer>();
		Set<Integer> visited = new HashSet<Integer>();

		// First we need to get the list of perfect squares.
		List<Integer> perfectSquares = new ArrayList<Integer>();
		int start = 1;
		while (start * start <= n) {
			perfectSquares.add(start * start);
			queue.add(start * start);
			start++;
		}

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int currentSum = queue.poll();
				if (!visited.add(currentSum))
					continue;
				if (currentSum == n) {
					return nums;
				} else {
					for (Integer square : perfectSquares) {
						if (!visited.contains(currentSum + square)) {
							queue.add(currentSum + square);
						}
					}
				}
			}
			nums++;
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(numSquares(18));
	}
}
