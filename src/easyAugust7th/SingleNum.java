package easyAugust7th;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNum {
	 public int singleNumber(int[] nums) {
		 int single = nums[0];
	        HashMap<Integer, Integer> seen = new HashMap<Integer,Integer>();
	        for(int i : nums){
	            if(seen.containsKey(i)){
	                seen.remove(i);
	            }else{
	                seen.put(i,1);
	            }
	        }
	        for(int i : nums){
	            if(seen.get(i) == 1){
	                return i;
	            }
	        }
	        return 0;
	    }
	 
	 /*
	  * , , , , , , , 8, 10, 15, , , , 
	  * , 8, 10, 15, , , , , , ,, , , , 
	  */
}
