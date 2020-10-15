package FlightQuestions;

public class SingleElementInSorted {
	public static int singleElement(int[] list) {
		for (int i = 0; i < list.length - 1; i+=2) {
			if(list[i] != list[i+1]) {
				return list[i];
			}
			
		}
		if(list[list.length-1] != list[list.length-2]) {
			return list[list.length-1];
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] input = new int[] {3,3,7,7,10,11,11};
		System.out.println(singleElement(input));
	}
}
