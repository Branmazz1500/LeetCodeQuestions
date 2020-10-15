package mediumQuestion;

public class MinCostTickets {
	public int mincostTickets(int[] days, int[] costs) {
		int cost = 0;
		int[] daysCost = new int[days.length];

		for (int i = 0; i < days.length; i++) {
			int lowest = i > 0 ? daysCost[i - 1] + costs[0] : costs[0];
			int currI7 = i > 7 ? i - 7 : 0;
			int currDay = days[i];
			int dayCt7 = 0;
			int currI30 = i > 30 ? i - 30 : 0;
			int dayCt30 = 0;
			
			for (int j = 0; j < 7; j++) {
				if (currDay == days[currI7 + j]) {
					dayCt7++;
				}
			}
			
			for (int j = 0; j < 7; j++) {
				if (currDay == days[currI30 + j]) {
					dayCt30++;
				}
			}
			
			if(dayCt7 * costs[0] > costs[1]) {
				lowest = i > 0 ? daysCost[i - 7] + costs[1] : costs[1];
			}
			
			if(dayCt30 * costs[0] > costs[1]) {
				lowest = i > 0 ? daysCost[i - 30] + costs[0] : costs[2];
			}
			
			daysCost[i] = lowest;

		}

		return daysCost[days.length-1];
	}
	
	public static void main(String[] args) {
		
	}
}
