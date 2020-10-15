package mediumQuestion;

import java.util.HashMap;
import java.util.Map;

public class CharFreqs {
	 public String frequencySort(String s) {
	        Map<String, Integer> charFrequency = new HashMap<>();
	        
	        for(int i = 0; i<s.length();i++){
	        	String c = s.substring(i,i+1);
	            if(charFrequency.containsKey(c)){
	                charFrequency.put(c,charFrequency.get(c) + 1);
	            }else {
	            	charFrequency.put(c,1);
	            }
	        }
	        return s;
	    }
}
