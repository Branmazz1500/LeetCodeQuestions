package MediumQuestions;
import java.util.*;
public class PathsFromSourceToTargeet {
	 public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
	        List<Integer> startPoint = new ArrayList<Integer>();
	        startPoint.add(0);
	        return findPaths(new ArrayList<List<Integer>>(), startPoint, graph, 0);
	    }
	    
	    public static List<List<Integer>> findPaths(List<List<Integer>> result, List<Integer> temp, int[][] graph, int index){
	        if(temp.get(temp.size()-1) == graph[graph.length-2][0]){
	            result.add(new ArrayList<>(temp));
	            return result;
	        }
	        for(int i = 0; i<graph[index].length; i++){
	            temp.add(graph[index][i]);
	            findPaths(result, temp, graph, graph[index][i]);
	            temp.remove((Object)graph[index][i]);
	        }
	        return result;
	    }
	    
	    public static int singleNumber(int[] nums) {
	        int a = 0;
	        for (int i : nums) {
	          a ^= i;
	        }
	        return a;
	      }
	    public static void main(String...strings) {
	    	singleNumber(new int[] {1,2,2,3,1});
	    }
	    
	  
}
