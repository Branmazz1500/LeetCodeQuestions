package mediumQuestion;

public class NumberOfTeams {
	  public static int numTeams(int[] rating) {
		  	int num = 0;
		  	for(int i = 0; i<rating.length; i++) {
		  		for(int j=i+1; j<rating.length; j++) {
		  			for(int k = j + 1; k<rating.length; k++) {
		  				if(rating[i] < rating[j] && rating[j] < rating[k]) {
		  					num++;
		  				}else if(rating[i] > rating[j] && rating[j] > rating[k]){
		  					num++;
		  				}
		  			}
		  		}
		  	}
	        return num;
	    }
	  
	  
	  public static void main(String[] args) {
		  int[] inp = new int[] {1,2,3,4};
		  System.out.println(numTeams(inp));
	  }
}
