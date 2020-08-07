package easyQuestions;

import java.util.ArrayList;
import java.util.List;

public class VowelReverse {
    public String reverseVowels(String s) {
        List<Object> vowels = new ArrayList<Object>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
    	int left = 0;
    	int right = s.length() - 1;
    	s.toLowerCase();
    	char[] string = s.toCharArray();
    	
    	while(left<right) {
    		if(!vowels.contains(string[left])) {
    			left++;
    		}
    		if(!vowels.contains(string[right])) {
    			right--;
    		}
    		if(vowels.contains(string[left]) && vowels.contains(string[right])) {
    			char placeHolder = string[left];
    			string[left] = string[right];
    			string[right] = placeHolder;
    			left++;
    			right--;
    		}
    	}
        
        return String.valueOf(string);
    }
}
