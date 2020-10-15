package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubSequenceIncreasingSum {
	public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
		List<List<Integer>> sumsList = new ArrayList<List<Integer>>();
		int[] sums = array.clone();
		int[] pos = new int[array.length];
		Arrays.fill(pos, Integer.MIN_VALUE);
		int maxNumSum = array[0];
		int maxPos = 0;
		for(int i = 0; i< array.length; i++) {
			int currNum = array[i];
			for(int j = 0; j<= i; j++) {
				int otherNum = array[j];
				if(otherNum < currNum && (currNum + sums[j] > sums[i])) {
					sums[i] = currNum + sums[j];
					pos[i] = j;
					if(sums[i]>maxNumSum) {
						maxNumSum = sums[i];
						maxPos = i;
					}
				}else if(currNum > maxNumSum){
					maxNumSum = currNum;
						maxPos = i;
				}
				
			}
		}
		List<Integer> maxSum = new ArrayList<Integer>();
		maxSum.add(sums[maxPos]);
		
		List<Integer> numsUsed = new ArrayList<Integer>();
		while(maxPos != Integer.MIN_VALUE) {
			numsUsed.add(0,array[maxPos]);
			maxPos = pos[maxPos];
		}
		
		sumsList.add(maxSum);
		sumsList.add(numsUsed);
		
		return sumsList;
	}
	public static void main(String[] args) {
		int[] in = new int[] {8, 12, 2, 3, 15, 5, 7};
		
		System.out.println(maxSumIncreasingSubsequence(in));
	}
}
