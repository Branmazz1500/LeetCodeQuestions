package easyAugust7th;

import java.util.*;

public class MorseCode {
	 public static int uniqueMorseRepresentations(String[] words) {
		 	int uniqueCount = 0;
	        String[] morseAlphabet = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	        Set<String> unique = new HashSet<String>();
	        for(String word:words) {
	        	StringBuilder sb = new StringBuilder();
	        	char[] wordArray = word.toCharArray();
	        	for(char letters : wordArray) {
	        		sb.append(morseAlphabet[(int)letters - (int)'a']);
	        	}
	        	if(unique.add(sb.toString())){
	        		uniqueCount++;
	        	}
	        }
	    
	        return uniqueCount;
	    }
	 
	 public static void main(String[] args) {
		 String[] test = new String[] {"gin", "zen", "gig", "msg"};
		 System.out.println(uniqueMorseRepresentations(test));
	 }
}
