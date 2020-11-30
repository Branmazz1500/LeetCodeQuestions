package MediumQuestions;

import java.util.Arrays;

public class BreakString {
	  public static boolean checkIfCanBreak(String s1, String s2) {
	        char[] c1 = s1.toCharArray();
	        char[] c2 = s2.toCharArray();
	        boolean b = true;
	        Arrays.sort(c1);
	        Arrays.sort(c2);
	        for(int i = 0; i<c1.length; i++) {
	        	if((int) c1[i] >= (int)c2[i]) {
	        		continue;
	        	}else {
	        		b = false;
	        	}
	        }
	        if(b) {
	        	return b;
	        }
	        for(int i = 0; i<c1.length; i++) {
	        	if((int) c2[i] >= (int)c1[i]) {
	        		continue;
	        	}else {
	        		return false;
	        	}
	        }
	        return true;
	    }
	  
	  public static void main(String[] args) {
		  String s1 = "leetcodee";
		  String s2= "interview";
		  
		  System.out.println(checkIfCanBreak(s1,s2));
		  
	  }
}
