package MediumQuestions;

public class CountBits {
	   public static int[] countBits(int num) {
	        int[] result = new int[num+1];
	        for(int i = 0; i<=num; i++){
	            int twoPow = 2;
	            while(twoPow <= i){
	                twoPow *= 2;
	            }
	            
	            result[i] = i >=2 ? (1 + result[i-twoPow]) : i;
	        }
	        return result;
	    }
	   
	   public static void main(String[] args) {
		   System.out.println(countBits(5));
	   }
}
