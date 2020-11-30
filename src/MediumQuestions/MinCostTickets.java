package MediumQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class MinCostTickets {
	public static int mincostTickets(int[] days, int[] costs) {

		int[] dp = new int[366];
		int d = 0;
		for(int i = 1; i<366; i++) {
			if(i == days[d]) {
				dp[i] = Math.min((dp[i-1]+costs[0]), (dp[Math.max(0,i-7)] + costs[1]));
				dp[i] = Math.min(dp[i], dp[Math.max(0,i-30)] + costs[2]);
				if(d == days.length-1) {
					return dp[i];
				}
				d++;
			}else {
				dp[i] = dp[i-1];
			}
		}
		return dp[365];
	}
	
	public static void main(String[] args) {
		int[]days = new int[] {1,4,6,7,8,20}, costs = new int[] {2,7,15};
		System.out.println(mincostTickets(days, costs));
	}
}
