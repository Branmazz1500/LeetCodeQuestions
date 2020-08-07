package mediumQuestion;

public class LongestPeak {
	public static int longestPeak(int[] array) {
		int currentLongestPeak = 0;
		int currentCount = 1;
		boolean goingUp = true;
		for(int i = 0; i<array.length-1; i++) {
			if(goingUp) {
				if(array[i]<array[i+1]) {
					currentCount++;
				}else if(array[i]>array[i+1] && currentCount>=2) {
					goingUp =false;
					currentCount++;
				}else {
					currentCount=1;
				}
			}else if(!goingUp) {
				if(array[i]>array[i+1]) {
					currentCount++;
				}else if(array[i]<array[i+1]) {
					if(currentCount > currentLongestPeak) {
						currentLongestPeak = currentCount;
					}
					currentCount = 2;
					goingUp = true;
				}
			}
		}
		if(currentCount>currentLongestPeak && !goingUp) {
			currentLongestPeak = currentCount;
		}
		return currentLongestPeak;
	}
	
	public static void main(String[] args) {
		int[] input = new int[] {1, 3, 2};
		System.out.println(longestPeak(input));
	}
	
	
}
