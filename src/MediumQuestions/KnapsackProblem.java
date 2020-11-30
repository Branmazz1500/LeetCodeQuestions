package MediumQuestions;

import java.util.*;
public class KnapsackProblem {
	 public static List<List<Integer>> knapsackProblem(int[][] items, int capacity) {
		    List<List<Integer>> result = new ArrayList<List<Integer>>();
				int[][] knapsack = new int[capacity][capacity];
				for(int i = 0; i<items.length; i++){
					for(int j = 0; j<capacity; j++){
						if(items[i][1] < j){
							knapsack[i][j] = knapsack[i-1][j];
						}else if(items[i][1] >= j){
							knapsack[i][j] = knapsack[i][j-(items[i][1])]+knapsack[i-1][items[i][1]];
						}
					}
					
				}
				
		    return result;
		  }
	 
	 public static void main(String[] args) {
		 int[][] input = new int[][]{new int[] {1,2}, new int[] {4,3}, new int[] {5,6},
			 new int[] {6,7}};
			 
			 System.out.println(knapsackProblem(input, 10));
	}
}
