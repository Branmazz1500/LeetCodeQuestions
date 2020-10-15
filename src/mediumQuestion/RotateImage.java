package mediumQuestion;

public class RotateImage {
    public static void rotate(int[][] matrix){
        int numOfRows = matrix.length;
        for(int row = 0; row < (numOfRows/2); row++){
            int first = row;
            int last = numOfRows-1-row;
            for(int i = first; i < last; i++){
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
    }   
    
    public static void main(String[] args) {
    	int[][] matrix = new int[4][4];
    	matrix[0][0] = 1;
    	matrix[0][1] = 2;
    	matrix[0][2] = 3;
    	matrix[1][0] = 4;
    	matrix[1][1] = 5;
    	matrix[1][2] = 6;
    	matrix[2][0] = 7;
    	matrix[2][1] = 8;
    	matrix[2][2] = 9;
    	rotate(matrix);
    	
    	for(int i = 0; i<matrix.length; i++) {
    		System.out.print("[");
    		for(int j = 0; j<matrix[0].length; j++) {
    			System.out.print(","+matrix[i][j]);
    		}
    		System.out.print("]");
    	}

    	
    }
}
