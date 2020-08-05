package easyQuestions;

import java.util.Arrays;

public class toLowerCase {
	   public String toLowerCases(String str) {
		   	return str.toLowerCase();
	    }
	    public static void duplicateZeros(int[] arr) {
	        int[] result = new int[arr.length];
	        int length = 0;
	        int resultLength = 0;
	          while(resultLength<arr.length){
	              if(arr[length] != 0){
	                  result[resultLength] = arr[length];
	                  length++;
	                  resultLength++;
	              }else if(arr[length] == 0){
	                  if(resultLength + 2 < arr.length){
	                      result[resultLength] = 0;
	                      resultLength++;
	       
	                      result[resultLength] = 0;
	                      resultLength++;
	                      length++;
	                  }else{
	                      result[resultLength] = 0;
	                      length++;
	                      resultLength++;
	                  }
	              }
	          }
	          arr=result.clone();
	      }
	    public static void main(String[] args) {
	    	int[] t = new int[] {1,0,2,3,0,4,5,0};
	    	duplicateZeros(t);
	    	System.out.println(t);
	    }
	    
	    public static void duplicateZeros2(int[] arr) {
	        for(int i = 0; i<arr.length;i++) {
	        	if(arr[i]==0) {
	        		
	        	}
	        }
	      }
	    public static void arrShift(int[] arr, int startPos) {
	    	
	    	for(int i = startPos; i<arr.length-1; i++) {
	    		int placeHolder = arr[startPos + 1];
	    		arr[startPos + 1] = arr[startPos];
	    		arr[startPos] = 0;
	    	}
	    }
}
