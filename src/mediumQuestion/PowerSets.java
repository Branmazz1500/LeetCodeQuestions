package mediumQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSets {
	public static List<List<Integer>> powerset(List<Integer> array) {
		List<List<Integer>> sets = new ArrayList<List<Integer>>();
		List<Integer> current = new ArrayList<Integer>();
		sets.add(current);
		
		for(int i = 0; i< array.size(); i++){
			int setSize = sets.size();
			for(int j = 0; j<setSize; j++) {
				List<Integer> latest = new ArrayList<Integer>(sets.get(j));
				latest.add(array.get(i));
				sets.add(latest);
			}
		}
		

		return sets;
	}

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 3);
		System.out.println(powerset(input));
	}
}
