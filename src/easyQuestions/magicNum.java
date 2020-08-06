package easyQuestions;

import java.util.ArrayList;
import java.util.List;

public class magicNum {
	  public static List<Integer> luckyNumbers (int[][] matrix) {
	        List<Integer> results = new ArrayList<Integer>();
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        int pos = 0;
	        for(int x = 0; x<matrix.length; x++) {
	        	for(int y = 0; y<matrix[x].length;y++) {
	        		if(matrix[x][y]<min) {
	        			min = matrix[x][y];
	        			pos = y;
	        		}
	        	}
	        	for(int z = 0; z<matrix.length; z++) {
	        		if(matrix[z][pos]>max) {
	        			max = matrix[z][pos];
	        		}
	        	}
	        	if(max == min) {
	        		results.add(max);
	        	}
	        	min = Integer.MAX_VALUE;
	        	max = Integer.MIN_VALUE;
	        	pos = 0;
	        }
	        return results;
	    }
	  
	  public static void main(String[] args) {
		  int[][] matrix = new int[][] {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		  List<Integer> result = luckyNumbers(matrix);
		  System.out.println(result);
	  }
}
