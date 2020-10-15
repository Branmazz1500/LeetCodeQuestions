package mediumQuestion;

public class ShiftArr {
	   public static void rotate(int[] nums, int k) {
	        int[] result = new int[nums.length];
	        for(int i = 0; i<nums.length; i++){
	            int newPos = i + k;
	            while(newPos>nums.length-1){
	                newPos-=nums.length;
	            }
	            result[newPos] = nums[i];
	        }
	        nums = result;
	    }
	   
	   public static void main(String[] args) {
		   int[] in = new int[] {1,2,3,4,5,6,7};
		   rotate(in,3);
		   System.out.println();
	   }
	   
}
