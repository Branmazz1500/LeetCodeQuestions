package easyAugust7th;

import java.util.ArrayList;
import java.util.List;

public class SumOddSubSeq {
	   public static int sumOddLengthSubarrays(int[] arr) {
	        int comboLength = 1;
	        int sum = 0;
	        
	        while(comboLength <= arr.length ){
	        	sum += getCombosSum(comboLength,arr);
	        	comboLength += 2;
	        }
	        
	        return sum;
	    }
	   
	   public static int getCombosSum(int comboLength, int[] arr){
		   int sum = 0;
		   
		   for(int i = 0; i + comboLength <=arr.length; i++) {
			   int currSum = 0;
			   for(int j = 0; j<comboLength; j++) {
				   if(j<comboLength) {
					   currSum += arr[i+j];
				   }
			   }
			   sum+= currSum;
		   }
		   
		   return sum;
	   }
	   
	   public static void main(String[] args) {
		   int[] in = new int[] {1,4,2,5,3};
		   System.out.println(sumOddLengthSubarrays(in));
	   }
}
