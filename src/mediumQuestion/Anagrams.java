package mediumQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Anagrams {
	  public static List<List<String>> groupAnagrams(List<String> words) {
		  Map<String,List<String>> found = new HashMap<String,List<String>>();  
		  for(String word:words) {
		    	char[] temp = word.toCharArray();
		    	Arrays.sort(temp);
		    	String tempWord = String.valueOf(temp);
		    	
		    	if(found.containsKey(tempWord)) {
		    		List<String> list = found.get(tempWord);
		    		list.add(word);
		    		found.put(tempWord, list);
		    	}else {
		    		List<String> list = new ArrayList<String>();
		    		list.add(word);
		    		found.put(tempWord, list);
		    	}
		    	
		
		    
		    }
		    return new ArrayList<>(found.values());
		  }
	  
	  public static void main(String[] args) {
		  List<String> input = new ArrayList<String>();
		  input.add("yo"); input.add("act"); input.add("flop"); input.add("tac");
		  input.add("foo"); input.add("cat"); input.add("oy"); input.add("olfp");
		  //"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"]
		  System.out.println(groupAnagrams(input));
	  }
}
