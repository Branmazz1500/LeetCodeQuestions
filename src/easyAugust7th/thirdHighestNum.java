package easyAugust7th;

import java.util.*;

public class thirdHighestNum {
	public static int thirdMax(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > third){
                third = nums[i];
                if(third>second){
                    int x = third;
                    third = second;
                    second = x;
                    if(second>first){
                    	int y = second;
                    	second = first;
                    	first = y;
                    	
                    }
                }
            }
        }
        return third;
    }
    

	
	public static void main(String[]args) {
		int[] in = new int[] {3,2,1};
		System.out.println(thirdMax(in));
	}
}
