package MediumQuestions;
import java.util.*;

public class Combooos {
	   
	    public static List<List<Integer>> combine(int n, int k) {
	    	List<List<Integer>> result = new ArrayList<List<Integer>>();
	        int i = 1;
	        int count = 0;
	        while(i < n){
	        	count++;
	            List<Integer> curr = new ArrayList<Integer>();
	            curr.add(i);
	            curr = (combos(curr, count+1, k));
	            if(curr.size() == k) {
	            	result.add(curr);
	            }
	            
	            if(count+1 == n){
	                i++;
	                count = i-1;
	            }
	        }   
	        return result;
	    }
	    
	    public static List<Integer> combos(List<Integer> curr, int n, int k){
	       while(curr.size() < k) {
	    	curr.add(n);
	        combos(curr, n+1,k);
	       }
	        return curr;
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(combine(4,2));
	    }
	    
}
