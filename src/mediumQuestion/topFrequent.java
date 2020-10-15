package mediumQuestion;

import java.util.Collection;
import java.util.HashMap;

public class topFrequent {
	 public int[] topKFrequent(int[] nums, int k) {
	        int[] result = new int[k];
	        HashMap<Integer,Integer> numsCount = new HashMap<Integer,Integer>();
	        for(int i = 0; i<nums.length; i++){
	            if(numsCount.containsKey(nums[i])){
	                numsCount.put(nums[i], numsCount.get(nums[i])+1);
	            }else{
	                numsCount.put(nums[i],1);
	            }
	        }
	        
	        
	        for(int j = 0; j<k; j++) {
	        	int max = 0;
	        	int count = 0;
	        	int pos = 0;
	        	for(int i = 0; i<nums.length; i++) {
	        		count = numsCount.get(nums[i]);
	        		max = Math.max(count, max);
	        		pos = i;
	        	}
	        	result[j] = nums[pos];
	        }
	        
	        return result;
	    }
}
