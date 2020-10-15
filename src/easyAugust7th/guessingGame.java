package easyAugust7th;

public class guessingGame {
	  public static int guessNumber(int n) {
	        int min = 1; int max = n;
	        int guess = (min+max)/2;
	        while(min<=max){
	           
	            if(guess(guess) == 0){
	                return guess;
	            }else if(guess(guess) == 1){
	                max = guess-1;
	                guess = (min + max)/2;
	            }else if(guess(guess) == -1){
	                min = guess+1;
	                guess = (min + max)/2;
	            }
	        }
	        return -1;
	    }
	  public static int guess(int n) {
		  int value = 1702766719;
		  if(n == value) {
			  return 0;
		  }else if(n > value) {
			  return 1;
		  }else {
			  return -1;
		  }
	  }
	  
	  public static void main(String[] args) {
		  System.out.println(guessNumber(2126753390));
		  
		  
	  }
}
