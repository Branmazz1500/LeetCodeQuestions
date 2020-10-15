package easyAugust7th;

public class OddCellss {
	  public int oddCells(int n, int m, int[][] indices) {
	       int oddCount = 0;
	       int[][] matrix = new int[n][m];
	       for(int[] index : indices) {
	    	   int x = index[0];
	    	   int y = index[1];
	    	   for(int i = 0; i<matrix[x].length; i++) {
	    		   matrix[x][i] += 1;
	    		   if(matrix[x][i] % 2 != 0) {
	    			   oddCount++;
	    		   }else {
	    			   oddCount--;
	    		   }
	    	   }
	    	   for(int i = 0; i<matrix.length; i++) {
	    		   matrix[i][y] += 1;
	    		   if(matrix[i][y] % 2 != 0) {
	    			   oddCount++;
	    		   }else {
	    			   oddCount--;
	    		   }
	    	   }
	       }
	       return oddCount;
	    }
}
