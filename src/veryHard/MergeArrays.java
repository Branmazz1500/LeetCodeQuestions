package veryHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {
	public static List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {
		List<Integer> result = new ArrayList<Integer>();
		int listCount = 0;
		int listSmallestIsFrom = 0;
		int min = Integer.MAX_VALUE;
		int smallestInList = 0;
		while (!arrays.get(0).isEmpty()) {
			listCount = 0;
			listSmallestIsFrom = 0;
			min = Integer.MAX_VALUE;
			smallestInList = 0;
			for (List<Integer> x : arrays) {
				smallestInList = x.get(0) != null ? x.get(0) : Integer.MAX_VALUE;
				if (smallestInList < min) {
					min = smallestInList;
					listSmallestIsFrom = listCount;
				}
				listCount++;
			}
			result.add(min);
			if (arrays.get(listSmallestIsFrom) != null && !arrays.get(listSmallestIsFrom).isEmpty()) {
				arrays.get(listSmallestIsFrom).remove(0);
				if (arrays.get(listSmallestIsFrom).size() == 0 && arrays.size()>1) {
					arrays.remove(listSmallestIsFrom);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
/*
 * {"arrays": [[1, 5, 9, 21], [-1, 0], [-124, 81, 121], [3, 6, 12, 20, 150]]}

 */
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 5,9,21)); 
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(-1, 0)); 
		//ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(-124, 81, 121)); 
		//ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(3, 6, 12, 20, 150)); 
		List<List<Integer>> input = new ArrayList<List<Integer>>(Arrays.asList(list1, list2));
		System.out.println(mergeSortedArrays(input));
	}
}
