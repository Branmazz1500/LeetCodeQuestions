package extremelyHard;

import java.util.ArrayList;
import java.util.List;

public class smallerThanToTheRight {
	public static List<Integer> rightSmallerThan(List<Integer> array) {

		int arrPos = 0;
		int count = 0;
		List<Integer> result = new ArrayList<Integer>();
		while (arrPos < array.size()) {
			int number = array.get(arrPos);
			for (int i = arrPos+1; i < array.size(); i++) {
				if(array.get(i)<number) {
					count++;
				}
			}
			result.add(count);
			arrPos++;
			count=0;
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(8);
		input.add(5);
		input.add(11);
		input.add(-1);
		input.add(3);
		input.add(4);
		input.add(2);
		System.out.println(rightSmallerThan(input));
	}
}
