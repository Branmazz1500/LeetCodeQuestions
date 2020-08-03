package easyQuestions;

public class subtractProductAndSumOfAnInt {
    public static int subtractProductAndSum(int n) {
    	Integer nums = n;
    	String numsString = nums.toString();
    	int multiply = 0;
    	int sum = 0;
    	for (int i = 0; i<numsString.length(); i++){
    		Integer digit1  = Integer.valueOf((numsString.substring(i, i+1)));
    		if(i == 0) {
    			multiply = digit1;
    			sum = digit1;
    		}else {
    			multiply = multiply * digit1;
    			sum = sum + digit1;
    		}
    	}
    	
    	return multiply - sum;
    	
    }
    
    public static void main(String[] args) {
    	int n = 1234;
    	System.out.println(subtractProductAndSum(n));
    }
}
