package easyAugust7th;

public class SquareRoot {
    public static int mySqrt(int x) {
        Integer i = 46340;
        int val = 0;
         while(val-x>=0){
        	 val = i * i;
             i++;
         }
         return i;
     }
    
    public static void main(String[] args) {
    	int x = 2147395600;
    	System.out.println(mySqrt(x));
    }
}
