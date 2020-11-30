package MediumQuestions;

import java.util.ArrayList;
import java.util.List;

public class ProdOfArrayExceptSlef {
	public static int[] productExceptSelf(int[] nums) {
        if(nums.length == 0) return nums;
        
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        //int right = 1;
        left[0] = 1;
        right[right.length-1] = 1;
        for(int i = 1; i<nums.length; i++){
            left[i] = nums[i-1] * left[i-1];
        }
        
        for(int i = nums.length-2; i>=0; i--){
            right[i] = nums[i+1] * right[i+1];
        }
        
        for(int i = 0; i<left.length; i++) {
        	left[i] = left[i] * right[i];
        }
      return left;
    }
	
	public static void main(String[] args) {
		System.out.println(productExceptSelf(new int[]{1,2,3,4}));
		List<Integer> hi = new ArrayList<Integer>();
		List<Integer> bye = new ArrayList<Integer>();

		hi.addAll(bye);
	}
}
