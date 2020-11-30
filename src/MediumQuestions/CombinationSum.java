package MediumQuestions;

import java.util.*;

public class CombinationSum {
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		int[][] test = new int[][] {};
		Arrays.sort(test);
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		HashMap<Integer, List<List<Integer>>> map = new HashMap<Integer, List<List<Integer>>>();
		int[] dp = new int[target + 1];
		dp[0] = 1;
		int[] dps = candidates.clone();
		HashMap<Integer, int[]> map2 = new HashMap<>();
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		Arrays.asList(set);
		for (int i = 1; i < dp.length; i++) {
			for (int k = 0; k < candidates.length; k++) {
				if (candidates[k] <= i) {
					if (candidates[k] - dp[i - candidates[k]] > 0) {
						List<List<Integer>> lists = map.getOrDefault(target-candidates[k], new ArrayList<>());
					
						if(lists.size() > 0){
                            for(int j = 0; j<lists.size(); j++){
							    List<Integer> newList = new ArrayList<>(lists.get(j));
						    	newList.add(candidates[k]);
							    List<List<Integer>> comboList = map.getOrDefault(i, new ArrayList<>());
							    comboList.add(newList);
						    	map.put(i,comboList);
					    	}
                        }
						StringBuilder sb = new StringBuilder();
					}
				}
			}
		}
		result = map.get(target);
		return result;
	}
	
	public List<List<Integer>> testReturn(){
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		Arrays.asList(set);
		return (List<List<Integer>>) set;
		
	}
	public static void main(String... args) {
		int[][] test = new int[][] {{2,6},{1,4}};
		Arrays.sort(test,(a, b) -> Double.compare(a[0], b[0]));
		System.out.println(test);
		
	}
}
