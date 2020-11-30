package MediumQuestions;

public class TargetSum {
	static int count = 0;
	  public static int findTargetSumWays(int[] nums, int target) {
	        
	        sum(nums,0,nums[0],target);
	        sum(nums,0,-nums[0],target);
	        
	        return count;
	    }
	    public static void sum(int[] nums, int index, int sum, int target){
	       
	        if(index == nums.length-1){
	            count = sum == target ? count+=1 : count;
	        }else{
	        	index++;
	            sum(nums, index, sum+nums[index], target);
	            sum(nums, index, -(sum+nums[index]), target);
	        }
	      
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(findTargetSumWays(new int[] {1,1,1,1,1},3));
	    }
}
