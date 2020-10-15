package hard;

public class MinRewards {
	  public static int minRewards(int[] scores) {
		    int[] changes = new int[scores.length];
		    for(int i = 0; i<scores.length;) {
		    	int count = 0;
		    	int k = i;
		    	int o = i;
		    	if(k<=scores.length-1 && scores[k] > scores[k+1]) {
		    		while(k<scores.length-1 && scores[k] > scores[k+ 1]) {
		    			count++;
		    			k++;
		    		}
	    			int before = i > 0 ? changes[i-1] : 1;
		    		for(int j = i; count >= 0; count--) {
		    			System.out.println("Top : The value of I is: " + i + " the value of count is: " + count);

		    			changes[j] = before + count;
		    		
		    			if(count == 0) {
		    				changes[j] = 1;
		    			}else {
		    				j++;
		    				i++;
		    			}
		    		}
		    	}else if(k<=scores.length-1 && scores[k] < scores[k+1]) {
		    		i++;
		    		while(k<scores.length-1 && scores[k] < scores[k+1]) {
		    			count++;
		    			k++;
		    		}
	    			int before = i > 0 ? changes[i-1] : 0;
	    			
		    		for(int j = i; count>0; count--) {
		    			System.out.println("Bottom : The value of I is: " + i + " the value of count is: " + count);
		    			changes[j] = before + count;
		    			j++;
		    			i++;
		    		}
		    	}else if(k == scores.length-1) {
		    		if(scores[k] > scores[k-1]) {
		    			changes[i] = changes[i-1] + 1;
		    		}else {
		    			changes[i] = 1;
		    		}
		    		i++;
		    	}
    			
		    	

		    }
		    	
		    
		    
		    int sum = 0;
		    for(int x : changes) {
		    	sum += x;
		    	System.out.println(x);
		    }
		    
	    return sum;
	  }
	  
	  public static void main(String[] args) {
		  int[] inp = new int[] {8, 4, 2, 1, 3, 6, 7, 9, 5};
		 // minRewards(inp);
		  System.out.println(minRewards(inp));
	  }
}
