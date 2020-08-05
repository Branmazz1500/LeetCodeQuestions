package mediumQuestion;

import java.util.ArrayList;
import java.util.List;

public class spiralTraverse {
	public static List<Integer> getPerimeter(int[][] array) {
		int currentHeight = 0; // start at first position
		int currentWidth = 0;
		int perimeterWidth = array[0] != null ? array[0].length - 1 : 0; // length of the arrays is the width of the
																			// square
		int perimeterHeight = array != null ? array.length - 1 : 0;

		List<Integer> results = new ArrayList<Integer>();

		if(array.length == 1) {
			for(int a : array[0]) {
				results.add(a);
			}
			return results;
		}
		
		while (perimeterHeight >= currentHeight && currentWidth<=perimeterWidth) {
			for (int i = currentWidth; i <= perimeterWidth; i++) {
				results.add(array[currentHeight][i]);
			}
			for (int i = currentHeight + 1; i <= perimeterHeight; i++) {
				results.add(array[i][perimeterWidth]);
			}
			for (int i = perimeterWidth - 1; i >= currentWidth; i--) {
				results.add(array[perimeterHeight][i]);
			}
			for (int i = perimeterHeight - 1; i > currentHeight; i--) {
				results.add(array[i][currentHeight]);
			}
			currentHeight++;
			currentWidth++;
			perimeterWidth--;
			perimeterHeight--;
		}
	
		 if(results.size() > array.length){
			 results.remove(results.size()-1);
		 }

		return results;
	}
	
	public static void main(String[] args) {
		int[][] input = new int[][] {{27, 12, 35, 26},{25, 21, 94, 11},{19, 96, 43, 56},{55, 36, 10, 18},{96, 83, 31, 94},{93, 11, 90, 16}};
		int[][] input2 = new int[][] {{1,2,3},{8,9,4},{7,6,5}};
		System.out.println(getPerimeter(input2));
	}
	
	/*
	 * 
	[27, 12, 35, 26],
    [25, 21, 94, 11],
    [19, 96, 43, 56],
    [55, 36, 10, 18],
    [96, 83, 31, 94],
    [93, 11, 90, 16]
	 */
}
