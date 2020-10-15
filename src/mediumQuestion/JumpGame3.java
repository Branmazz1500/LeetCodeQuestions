package mediumQuestion;

import java.util.*;

public class JumpGame3 {
    public static boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        Set<Integer> visited = new HashSet<Integer>();
        
        q.offer(start);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                Integer curr = q.poll();
                if(!visited.add(curr)) continue;
                int[] nextIndexes = getNextIndex(arr,curr);
                if(arr[nextIndexes[0]] == 0){
                    return true;
                }else{
                    if(!visited.contains(nextIndexes[0])){
                        q.offer(nextIndexes[0]);
                    }
                }
               if(arr[nextIndexes[1]] == 0){
                   return true;
               }else{
                   if(!visited.contains(nextIndexes[1])){
                       q.offer(nextIndexes[1]);
                   }
               }
            }
        }
        return false;
    }
    
    public static int[] getNextIndex(int[] arr, int curr){
        int[] nextIndex = new int[2];
        int valueAtPos = arr[curr];
        
        int forward = (curr + valueAtPos) <= arr.length-1 ? curr + valueAtPos
            : (curr + valueAtPos) - (arr.length);
        
        int backward = (curr - valueAtPos) >= 0 ? curr - valueAtPos 
            : (arr.length + (curr -valueAtPos));
        
        nextIndex[0] = forward;
        nextIndex[1] = backward;
        
        return nextIndex;
    }
    
    public static void main(String[] args) {
    	int[] in = new int[] {4,2,3,0,3,1,2};
    	int start = 5;
    	System.out.println(canReach(in,start));
    	
    }
   
}
