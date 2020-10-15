package mediumQuestion;

public class FindDupe2Pointer {
	 public static int findDuplicateApproach(int[] nums){
	        int slow = 0;
	        int fast = 1;
	        while(nums[slow] != nums[fast]){
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	        }
	        slow = nums[0];
	       while(fast != slow){
	           fast = nums[fast];
	           slow = nums[slow];
	       }
	       return nums[fast];
	    }
	 
	 public static void main(String[] args) {
		 int[] in = new int[] {1,3,4,2,2};
		 System.out.println(findDuplicateApproach(in));
	 }
}
