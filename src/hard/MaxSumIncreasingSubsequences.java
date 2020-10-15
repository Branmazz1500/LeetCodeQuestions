package hard;

import java.util.ArrayList;
import java.util.List;

public class MaxSumIncreasingSubsequences {
	 public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
		    int[] maxSum = new int[array.length];
				maxSum[0] = array[0];
				int smallestSub = maxSum[0];
				for(int i = 1; i<array.length; i++){
					int highest = smallestSub;
					int highestPos = 0;
					if(array[i] < smallestSub){
						smallestSub = array[i];
						maxSum[i] = array[i];
					}else{
						for(int j = 0; j<i; j++){
								if(array[j] > highest){
								highest = array[j];
								highestPos = j;
							}
						}
						maxSum[i] = maxSum[highestPos] + array[i];
					}
				}
				System.out.println(maxSum);
		    return new ArrayList<List<Integer>>() {
		      {
		        add(List.of(10)); // Example max sum
		        add(List.of(2, 3, 5)); // Example max sequence
		      }
		    };
		  }
	 
	 public static void main(String[] args) {
		 int[] input = new int[] {8,12,2,3,15,5,7};
		 maxSumIncreasingSubsequence(input);
	 }
}
