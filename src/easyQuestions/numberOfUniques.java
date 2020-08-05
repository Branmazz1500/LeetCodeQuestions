package easyQuestions;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
 */
public class numberOfUniques {
	public static  boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> numOfOccurences = new HashMap<Integer,Integer>();
		for(int a : arr) {
			if(numOfOccurences.containsKey(a)) {
				numOfOccurences.put(a, numOfOccurences.get(a) + 1);
			}else {
				numOfOccurences.put(a, 1);
			}
		}
		
		Collection<Integer> hi = numOfOccurences.values();
	 return numOfOccurences.size() == hi.size();
	}
	
	public static void main(String[] args) {
		int[] input = new int[] {1,1,1,2,2,3,3,3,3};
		System.out.println(uniqueOccurrences(input));
	}
}
