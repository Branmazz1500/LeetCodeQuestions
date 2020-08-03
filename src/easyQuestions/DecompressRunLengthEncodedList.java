package easyQuestions;

public class DecompressRunLengthEncodedList {
 public static int[] decompressRLElist(int[] nums) {
		 
		 int size = 0;
		 //Calculate size of new array
		 for(int i = 0; i<nums.length; i+=2) {
			 size+=nums[i];
		 }
		
		 int[] result = new int[size];
		 int count = 0;
	     for(int i = 0; i<nums.length;i+=2) {
	        int freq = nums[i];
	        int val = nums[i+1];
	        
	        while(freq>0) {
	        	result[count] = val;
	        	count++;
	        	freq--;
	        }
	     }
	     
	     return result;
	     
	    }
 
 public static void main(String[] args) {
	int[] testSet = new int[] {1,2,3,4};
	System.out.println(decompressRLElist(testSet));
 }
 
}
