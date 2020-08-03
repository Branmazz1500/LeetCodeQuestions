package easyQuestions;

public class SplitStringInBalancedString {
	   public int balancedStringSplit(String s) {
	        int rCount = 0; int lCount = 0; int pairCount = 0;
	        for(int i = 0; i < s.length(); i++){
	            if(s.substring(i,i+1).equals("R")){
	                rCount++;
	            }else{
	                lCount++;
	            }
	            
	            if(rCount == lCount){
	                rCount = 0; lCount = 0; pairCount++;
	            }
	        }
	        
	        return pairCount;
	    }
}
