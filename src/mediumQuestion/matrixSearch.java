package mediumQuestion;

public class matrixSearch {
	public static int[] searchInSortedMatrix(int[][] matrix, int target) {
		int x = 0;
		int y = 0;
		while(matrix[x][y] <= target){
			int length = matrix[x].length;
			for(int i = 0; i<length; i++){
				if(matrix[x][i] > target){
					x++;
					break;
				}else if(matrix[x][i] == target){
					return new int[]{x,i};
				}else if(i == length - 1) {
					x++;
				}
			}
		}
		
		return new int[] {-1, -1};
  }
	public static void main(String[] args) {
		int [][] matrix = new int[][] {{1,4,7,12,15,1000},{2,5,19,31,32,1001},{3,8,24,33,35,1002},{40,41,42,44,45,1003},{99,100,103,106,128,1004}};
		int[] result = searchInSortedMatrix(matrix,1004);
		//System.out.println(searchInSortedMatrix(matrix, 44));
	}
}
