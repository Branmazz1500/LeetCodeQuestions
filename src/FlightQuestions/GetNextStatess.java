package FlightQuestions;

import java.util.LinkedList;
import java.util.List;

public class GetNextStatess {
	 private static List<String> getNextStates(String lock) {
	        List<String> locks = new LinkedList<>();
	        char[] arr = lock.toCharArray();
	        for (int i = 0; i < arr.length; i++) {
	            char c = arr[i];
	            arr[i] = c == '9' ? '0' : (char) (c + ((char) 1));
	            locks.add(String.valueOf(arr));
	            arr[i] = c == '0' ? '9' : (char) (c - ((char) 1));
	            locks.add(String.valueOf(arr));
	            arr[i] = c;
	        }
	        return locks;
	    }
	 public static void main(String[] args) {
		
		 System.out.println(getNextStates("0000"));
	 }
}
