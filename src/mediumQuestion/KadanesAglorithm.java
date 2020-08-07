package mediumQuestion;

public class KadanesAglorithm {
	public static int kadanesAlgorithm(int[] array) {
	
		int max = 0;
		int currentSum = 0;
		int newSum = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i]+currentSum>0) {
				currentSum+= array[i];
			}else {
				currentSum = 0;
			}
			if(currentSum>max) {
				max = currentSum;
			}
		}
		
	return max;
	}
	
	public static void main(String[] args) {
		int[] input = new int[] {3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4};
		System.out.println(kadanesAlgorithm(input));
	}
}
