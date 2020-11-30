package MediumQuestions;

public class UniquePaths {
	
	  public static int uniquePaths(int m, int n) {
	        int count = 0;
	        countPaths(0,0,m,n,count, 0);
	        return count;
	    }
	    public static  void countPaths(int x, int y, int height, int width, int count, int recursiveNum){
	        if(x == height && y == width){
	            ++count;
	        }
	        System.out.println("X: " + x + " Y: " + y);
	        if(x < height){
	            countPaths(x+1, y, height, width, 0, recursiveNum++);
	            System.out.println(recursiveNum);
	        }
	        if(y < width){
	           countPaths(x,y+1, height, width, 0, recursiveNum++);
	            System.out.println(recursiveNum);
	        }

	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(uniquePaths(3, 3));
	    }
}
