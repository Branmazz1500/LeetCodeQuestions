package EasyQuestions;

import java.util.*;

public class Decip {
	 
	 public static List<Integer> findAnagrams(String s, String p) {
	        List<Integer> result = new ArrayList<>();
	        if(s.length() == 0 || s == null) return result;
	        
	        int[] charCount = new int[26];
	        for(char c : p.toCharArray()){
	            charCount[c-'a']++;
	        }
	        
	        int left = 0, right = 0, count = p.length();
	        while(right < s.length()){
	            if(charCount[s.charAt(right++)-'a']-- >= 1) count--;
	            if(count == 0) result.add(left);
	            if(right - left == p.length() && charCount[s.charAt(left++)-'a']++ >= 0) count++;
	        }
	        
	        
	        return result;
	    }  
	
	    
	    public static void main(String...strings) {
	   
	    	System.out.println(findAnagrams("cbaebabacd", "abc"));
	    }
	 
}
