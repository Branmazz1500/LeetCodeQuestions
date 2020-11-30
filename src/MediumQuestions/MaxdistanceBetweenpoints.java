package MediumQuestions;
import java.util.*;
public class MaxdistanceBetweenpoints {
	 public static int maxWidthOfVerticalArea(int[][] points) {
	        int[] yPoints = new int[points.length];
	        for(int i = 0; i<points.length; i++){
	            yPoints[i] = points[i][0];
	        }
	        
	        Arrays.sort(yPoints);
	        int maxDistance = 0;
	        int prev = yPoints[0];
	        
	        for(Integer point : yPoints){
	            maxDistance = Math.max(maxDistance,point-prev);
	            prev = point;
	        }
	        
	        return maxDistance;
	    }
	 
	 
}
