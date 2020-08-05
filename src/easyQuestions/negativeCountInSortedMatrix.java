package easyQuestions;

public class negativeCountInSortedMatrix {
	public static int countNegatives(int[][] grid) {
		int count = 0;
		for(int i = 0; i<grid.length;i++) {
			for(int j = grid[i].length- 1; j>=0; j--) {
				if(grid[i][j] < 0) {
					count++;
				}else {
					break;
				}
			}
				
		}
		return count;
    }
	
	public static void main(String[] args) {
		int[][] input = new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(countNegatives(input));
	}
	//[[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
}
