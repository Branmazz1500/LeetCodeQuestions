package EasyQuestions;

public class removeDupes {
	 public static String removeDuplicates(String S) {
	        StringBuilder sb = new StringBuilder(S);
	        for(int i = 1; i<sb.length(); i++){
	            if(sb.charAt(i) == sb.charAt(i-1)){
	                sb.deleteCharAt(i);
	                sb.deleteCharAt(i-1);
	                i = i - 2 >= 0 ? i - 2 : 0;
	            }
	        }
	        
	        return sb.toString();
	    }
	 public static void main(String...strings) {
		 System.out.println(removeDuplicates("abbaca"));
	 }
}
