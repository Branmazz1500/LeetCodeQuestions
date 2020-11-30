package MediumQuestions;

public class SearchRange {
	  public static int[] searchRange(int[] nums, int target) {
	        int[] result = new int[2];
	        int left = 0;
	        int right = nums.length-1;
	        while(left < right){
	            int middle = (left + right)/2;
	            if(nums[middle]>target){
	                right = middle;
	            }else if(nums[middle] < target){
	                left = middle;
	            }else if(nums[middle] == target){
	                left = middle;
	                right = middle;
	                break;
	            }
	        }
	        
	        if(nums[left] != target){
	            return new int[]{-1,-1};
	        }
	        
	        boolean startFound = false;
	        boolean endFound = false;
	        while(!startFound && !endFound){
	            if(nums[left] == target){
	                if(left > 0){
	                    left--;
	                }else{
	                    result[0] = left;
	                    startFound = true;
	                }
	            }else{
	                result[0] = left+1;
	                startFound = true;
	            }
	            if(nums[right] == target){
	                if(right < nums.length-1){
	                    right++;
	                }else{
	                    result[1] = right--;
	                    endFound = true;
	                }
	            }else{
	                result[1] = right-1;
	                endFound = true;
	            }
	        }
	        return result;
	    }
	  public static void main(String[] args) {
		  int[] in = new int[] {5,7,7,8,8,10};
		  System.out.println(searchRange(in,8));
	  }
}
