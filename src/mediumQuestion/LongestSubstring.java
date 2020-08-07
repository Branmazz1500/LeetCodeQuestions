package mediumQuestion;

import java.util.HashMap;

public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		int currentCount = 0;
		int longestCount = 0;
		HashMap<String, Integer> seen = new HashMap<String, Integer>();
		for (int index = 0; index < s.length(); index++) {
			String character = s.substring(index, index + 1);
			if (seen.containsKey(character)) {
				longestCount = Math.max(longestCount, currentCount);
				if(seen.get(character) == index-1) {
					currentCount = 1;
					seen.clear();
					seen.put(character,index);
				}else {
					currentCount = index - seen.get(character);
					seen.remove(character);
					seen.put(character,index);
				}
			} else {
				seen.put(character, index);
				currentCount++;
			}
		}
		return Math.max(longestCount, currentCount);
	}
	
	public static void main(String[] args) {
		String input = "dvdf";
		System.out.println(lengthOfLongestSubstring(input));
	}

}
