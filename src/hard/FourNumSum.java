package hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumSum {
	public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
		List<Integer[]> quadruplets = new ArrayList<Integer[]>();
		Map<Integer, List<Integer[]>> allPairSums = new HashMap<>();
		
		for(int i = 1; i<array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
				int sum = array[i] + array[j];
				int numNeeded = targetSum - sum;
				if(allPairSums.containsKey(numNeeded)) {
					for(Integer[] x : allPairSums.get(numNeeded)) {
						Integer[] quad = new Integer[4];
						quad[0] = array[i];
						quad[1] = array[j];
						quad[2] = x[0];
						quad[3] = x[1];
						quadruplets.add(quad);
					}
					
				}
			}
			
			for(int k = 0; k<i; k++) {
				int sum = array[i] + array[k];
				Integer[] pair = new Integer[]{array[i], array[k]};
				if(allPairSums.containsKey(sum)) {
					allPairSums.get(sum).add(pair);
				}else {
					List<Integer[]> existingList = new ArrayList<>();
					existingList.add(pair);
					allPairSums.put(sum,existingList);
				}
			}
		}

		return quadruplets;
	}
	
	public static void main(String[] args) {
		int[] test = new int[] {7,6,4,-1,1,2};
		int target = 16;
		for(Integer[] x : fourNumberSum(test,target)) {
			System.out.println("List: ");
			for(Integer y : x) {
				System.out.println(" " + y);
			}
		}
		System.out.println(fourNumberSum(test, target).toString());
	}
}
