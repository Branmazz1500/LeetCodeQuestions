package MediumQuestions;

import java.util.Arrays;
import java.util.List;

public class MatrixLowest {
	public static int kthSmallest(int[][] matrix, int k) {
        int[] leftRight = new int[]{0,1};
        int[] upDown = new int[]{1,0};
        int count = 1;
        int value = 0;
        while(count<k){
            count++;
            if(matrix[leftRight[0]][leftRight[1]] < matrix[upDown[0]][upDown[1]]){
                value = matrix[leftRight[0]][leftRight[1]];
                leftRight[1] = (leftRight[1] + 1) <= matrix[0].length-1 ? (leftRight[1] + 1) : 1;
                leftRight[0] = leftRight[1] == 1 ? leftRight[0] + 1 : leftRight[0];
            }else{
                value = matrix[upDown[0]][upDown[1]];
                if(upDown[0] + 1 < matrix.length) {
                	upDown[0] = upDown[0] + 1;
                }else {
                	upDown[1] = matrix.length-1;
                }
            }
            
            if(count == k){
                return value;
            }
        }
        return matrix[0][0];
    }
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1,5,9},{10,11,13},{12,13,15}};
		System.out.println(kthSmallest(matrix,8));
		
	}
}
