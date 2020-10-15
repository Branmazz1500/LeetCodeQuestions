package hard;

public class SubSort {
	public static int[] subarraySort(int[] array) {
		
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		//Go through and keep track of the smallest, and largest numbers out of order.
		for(int i = 0; i<array.length; i++) {
			
			//NumberBefore
			if(i>0 && array[i] < array[i-1]) {
				min = Math.min(min, array[i]);
			}
			
			if(i<array.length-1 && array[i]>array[i+1]) {
				max = Math.max(max, array[i]);
			}
		}

		
	
		for(int i = 0; i<array.length; i++) {
			if(array[i] > min) {
				min = i;
				break;
			}
		}

		for(int i = array.length-1; i>0; i--) {
			if(array[i] < max) {
				max = i;
			
				return new int[] {min,max};
			}
		}

		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		int[] input = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,2};
		System.out.println(subarraySort(input));

	}
}
