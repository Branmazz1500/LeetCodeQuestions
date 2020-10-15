package FlightQuestions;

import java.util.*;

public class OpenTheLock {
	public static int openLock(String[] deadends, String target) {
		int numOfMoves = 0;
		String start = "0000";
		Queue<String> queue = new LinkedList<>();
		Set<String> visited = new HashSet<>(Arrays.asList(deadends));
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i< size; i++) {
				String current = queue.poll();
				if(!visited.add(current)) continue;
				if(current.equals(target)) {
					return numOfMoves;
				}
				for(String next : getNextStates(current)) {
					if(!visited.contains(next)) {
						queue.offer(next);
					}
				}
			}
			numOfMoves++;
		}
		
		return numOfMoves;
	}
	
	public static List<String> getNextStates(String s){
		List<String> locks = new ArrayList<String>();
		char[] arr = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {
			char c = arr[i];
            arr[i] = c == '9' ? '0' : (char) (c + ((char) 1));
            locks.add(String.valueOf(arr));
            arr[i] = c == '0' ? '9' : (char) (c - ((char) 1));
            locks.add(String.valueOf(arr));
            arr[i] = c;		}
		return locks;
	}
	
	public static void main (String[] args) {
		String[] deadends = new String[] {"0201","0101","0102","1212","2002"};
		String target = "0202";
		System.out.println(openLock(deadends,target));
		
	}
}

