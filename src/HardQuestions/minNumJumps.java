package HardQuestions;

public class minNumJumps {
	 public static int minNumberOfJumps(int[] array) {
			if(array.length == 1) return 0;
			
	    int[] dp = new int[array.length];
			int currIndex = 1;
			int posWeCanTravel = array[0];
			int numOfMoves = 1;
			dp[0] = 0;
			
			while(dp[dp.length-1] == 0){
				int farthest = posWeCanTravel;
				for(int i = currIndex; i <= farthest; i++){
						dp[i] = numOfMoves;
						posWeCanTravel = posWeCanTravel < array[i] + i ? array[i] + i : posWeCanTravel;
				}
				currIndex = farthest+1;
				numOfMoves++;
			}
			
	    return dp[dp.length-1];
	  }
	 
	 public static void main(String[] args) {
		 int[] test = new int[] {2,1,2,3,1,1,1};
		 System.out.println(minNumberOfJumps(test));
	 }
}
