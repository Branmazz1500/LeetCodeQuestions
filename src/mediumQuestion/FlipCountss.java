package mediumQuestion;

public class FlipCountss {
	  public int minFlips(String target) {
	        char current = '0';
	        int flipCount = 0;
	        char[] tar = target.toCharArray();
	        for(char t : tar){
	            if(t != current){
	                flipCount++;
	                current = t;
	            }
	        }
	        return flipCount;
	    }
}
