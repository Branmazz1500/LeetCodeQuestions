package MediumQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AriSubs {
	 public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
	        List<Boolean> result = new ArrayList<Boolean>();
	        for(int i = 0; i<l.length; i++){
	            int start = l[i];
	            int end = r[i];
	            int[] subArray = new int[end-start+1];
	            for(int j = 0; j<end-start+1; j++){
	                subArray[j] = nums[j+start];
	            }
	            Arrays.sort(subArray);
	            int diff = subArray[0] - subArray[1];
	            if(subArray.length == 2) result.add(true);
	            for(int k = 2; k<subArray.length; k++){
	                if(subArray[k-1] - subArray[k] != diff){
	                    result.add(false);
	                    break;
	                }else if(k == subArray.length-1){
	                    result.add(true);
	                }
	            }
	        }
	        return result;
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(checkArithmeticSubarrays(new int[]{-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10},
				 new int[]{0,1,6,4,8,7}, new int[]{4,4,9,7,9,10}));
	 }
}
