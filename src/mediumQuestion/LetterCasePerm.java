package mediumQuestion;

import java.util.*;

public class LetterCasePerm {
	   public List<String> letterCasePermutation(String S) {
	        List<String> result = new ArrayList<String>();
	        Queue<String> q = new LinkedList<String>();
	        
	       char[] chars = S.toCharArray();
	       int lowest = (int) 'a';
	       int highest = (int) 'Z';
	       
	       for(char x : chars) {
	    	   int val = (int) x;
	    	   if(val >= lowest && val <= highest) {
	    	
	    	   }
	       }
	        
	        return result;
	    }
}
