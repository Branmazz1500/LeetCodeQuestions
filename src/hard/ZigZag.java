package hard;

import java.util.ArrayList;
import java.util.List;

public class ZigZag {
	public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
	 	List<Integer> result = new ArrayList<Integer>();
			int x = 0;
			int y = 0;
			
			if(x == 0) {
				result.add(array.get(x).get(y));
				x--;
				result.add(array.get(x).get(y));

				
			}
			
			
			while(x != array.size()-1 && y != array.get(0).size()-1){
				if(y == 0){
					result.add(array.get(x).get(y));
					x++;
					while(x != 0){
						result.add(array.get(x).get(y));
						x--;
						y++;
					}
				}else if(x == 0 && y != 0){
					result.add(array.get(x).get(y));
					if(y < array.get(0).size()-1) {
						y++;
					}else {
						x++;
					}
					while(y != 0){
						result.add(array.get(x).get(y));
						x++;
						y--;
					}
				}else if(x == array.size()) {
					x--;
					y++;
					result.add(array.get(x).get(y));
				}
			}
	    return result;
	  }
	
	
	
	public static void main(String[] args) {
		List<List<Integer>> in = new ArrayList<List<Integer>>();
		List<Integer> row1 = new ArrayList<Integer>();
		List<Integer> row2 = new ArrayList<Integer>();
		List<Integer> row3 = new ArrayList<Integer>();
		List<Integer> row4 = new ArrayList<Integer>();

		row1.add(1); row1.add(3); row1.add(4); row1.add(10);
		row2.add(2); row2.add(5); row2.add(9); row2.add(11);
		row3.add(6); row3.add(8); row3.add(12); row3.add(15);
		row4.add(7); row4.add(13); row4.add(14); row4.add(16);
		
		in.add(row1); in.add(row2); in.add(row3); in.add(row4);
		
		System.out.println(zigzagTraverse(in));

	}
}
