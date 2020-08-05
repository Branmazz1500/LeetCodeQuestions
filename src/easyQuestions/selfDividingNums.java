package easyQuestions;

import java.util.ArrayList;
import java.util.List;

public class selfDividingNums {
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<Integer>();
		while (left <= right) {
			if (left < 10) {
				result.add(left);
			} else {
				String leftString = String.valueOf(left);
				for (int i = 0; i < leftString.length(); i++) {
					int divisor = Integer.valueOf(leftString.substring(i, i + 1));
					if (divisor != 0 && left % divisor == 0) {
						if (i == leftString.length() - 1) {
							result.add(left);
						}
					}else {
						break;
					}
				}
			}
			left++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(21, 22));
	}
}
