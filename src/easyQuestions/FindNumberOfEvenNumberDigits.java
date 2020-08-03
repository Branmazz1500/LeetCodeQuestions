package easyQuestions;

public class FindNumberOfEvenNumberDigits {
	 public static int findNumbers(int[] nums) {
		 int count = 0;
	        for(int i = 0; i<nums.length;i++) {
	        	Integer number = nums[i];
	        	String numString = number.toString();
	        	if(numString.length()%2 == 0) {
	        		count++;
	        	}
	        }
	        return count;
	 }
	 
	 public static void main(String[] args) {
		 int[] nums = new int[] {123,1234,12345,123456};
		 System.out.println(findNumbers(nums));
	 }
	 
}
