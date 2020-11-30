package MediumQuestions;

import java.util.*;

public class NextPrm {
	  public static void nextPermutation(int[] nums) {
	        int min = nums.length-1;
	        for(int i = nums.length-1; i>0; i--){
	            if(nums[min] > nums[i]){
	                nums = swap(nums,min,i);
	                return;
	            }
	            if(nums[i] < nums[min]) min = i;
	        }
	        Arrays.sort(nums);
	    }
	    public static int[] swap(int[] nums, int indexA, int indexB){
	        int placeHolder = nums[indexA];
	        nums[indexA] = nums[indexB];
	        nums[indexB] = placeHolder;
	        return nums;
	    }
	    
	    public static void main(String[] args) {
	    	nextPermutation(new int[] {5,3,1,4,2});
	    	StringBuilder sb = new StringBuilder("hi");
	    	sb.delete(sb.length()-1, sb.length());
	    	System.out.println(sb);
	    	Set<String> set = new HashSet<String>();
	    	set.forEach(s->System.out.println(s));
	    }
}
