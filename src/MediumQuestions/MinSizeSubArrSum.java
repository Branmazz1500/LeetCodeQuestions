package MediumQuestions;

import java.util.HashMap;

public class MinSizeSubArrSum {
	 public static int minSubArrayLen(int s, int[] nums) {
	        int sum = 0;
	        int leftPointer = 0;
	        int minNum = Integer.MAX_VALUE;
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        for(int i = 0; i<nums.length; i++){
	            sum += nums[i];
	            if(sum >= s){
	                minNum = i-leftPointer + 1 < minNum ? i - leftPointer + 1 : minNum;
	                while(sum - nums[leftPointer] >= s){
	                    sum -= nums[leftPointer];
	                    leftPointer++;
	                    minNum = i-leftPointer + 1 < minNum ? i - leftPointer + 1 : minNum;
	                }
	            }
	            
	        }
	        minNum = minNum == Integer.MAX_VALUE ? 0 : minNum;
	        return minNum;
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
	 }
}
