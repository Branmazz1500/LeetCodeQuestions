package easyAugust7th;

public class BinarySearch {
	  public static int search(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length-1;
	        int middle = 0;
	        while(left < right){
	            middle = (left+right)/2;
	            if(nums[middle] == target){
	                return middle;
	            }else if(nums[middle]<target){
	                left = middle;
	            }else{
	                right = middle;
	            }
	        }
	        return -1;
	    }
	  public static void main(String[] args) {
		  int[] input = new int[] {-1,0,3,5,9,12};
		  System.out.println(search(input,9));
		  
	  }
}
