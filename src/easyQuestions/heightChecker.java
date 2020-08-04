package easyQuestions;

import java.util.Arrays;

class heightChecker {
	public static int heightCheckers(int[] heights) {
		int count = 0;
		int[] heightsClone = heights.clone();
		Arrays.sort(heights);
		for(int i =0; i<heights.length; i++) {
			if(heights[i] != heightsClone[i]) {
				count++;
			}
		}
		return count;
	}

	
	public static void main(String[] args) {
		int[] heights = new int[] {5,1,2,3,4};
		System.out.println(heightCheckers(heights));
	}
}
