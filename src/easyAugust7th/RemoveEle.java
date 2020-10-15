package easyAugust7th;
import java.util.*;

public class RemoveEle {
	 public static boolean checkIfExist(int[] arr) {
	        HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();
	        for(int i = 0; i<arr.length; i++){
	            int lookingForHalf = 0;
	            if(arr[i]%2 == 0){
	                lookingForHalf = (arr[i])/2;
	            }
	            int lookingForDouble = (arr[i])*2;
	            
	            if((lookingForHalf != 0 && seen.containsKey(lookingForHalf)) || seen.containsKey(lookingForDouble)){
	                return true;
	            }else{
	                seen.put(arr[i], true);
	            }
	        }
	        return false;
	    }
	 
	 public static void main(String[] args) {
		 	int [] input = new int[] {3,1,7,11};
		 	System.out.println(checkIfExist(input));
	 }
}
