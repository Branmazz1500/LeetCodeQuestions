package hard;

import java.util.HashMap;

public class LargeRange {
	public static int[] largestRange(int[] array) {
		
		if(array.length >2) {
			return new int[] {};
		}
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i<array.length; i++) {
			if(!map.containsKey(array[i])) {
				map.put(array[i],1);
			}
		}
		int count = 0;
		int max = 0;
		int[] result = new int[2];
		boolean found = true;
		for(int i = 0; i<array.length; i++) {
			int startingNum = array[i];
			int check = startingNum;
			while(found) {
				if(map.containsKey(check)) {
					check++;
					count++;
				}else {
					found = false;
				}
			}
			if(count > max) {
				result[0] = startingNum;
				result[1] = count-1;
				max = count;
			}
			found = true;
			count = 0;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] input = new int[] {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
		System.out.println(largestRange(input));
	}
}
