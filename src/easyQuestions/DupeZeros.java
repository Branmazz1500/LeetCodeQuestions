package easyQuestions;

public class DupeZeros {
	/*
	 * [{1,0,2,3,0,4,5,0}]
	 */
	public static void duplicateZeros(int[] arr) {
		int zeroCount = 0;
		int j = 0;
		boolean lastZero = false;
		while (j < arr.length - zeroCount - 1) {
			lastZero = false;
			if (arr[j] == 0) {
				zeroCount++;
				lastZero = true;
			}
			j++;
		}
		j = arr.length - zeroCount - 1;
		if (arr[j] == 0 && !lastZero) {
			if (arr[j] == 0) {
				arr[arr.length - 1] = 0;
				j--;
			}
		}
		if (arr[j] == 0 && lastZero) {
			arr[arr.length - 1] = 0;
			arr[arr.length - 2] = 0;
			zeroCount--;
			j--;
		}
		while (zeroCount > 0 && j >= 0) {
			if (arr[j] != 0) {
				arr[j + zeroCount] = arr[j];
			} else {
				arr[j + zeroCount] = arr[j];
				zeroCount--;
				arr[j + zeroCount] = arr[j];
			}
			j--;

		}
	}

	public static void main(String[] args) {
		// int[] input = new int[]
		// {9,9,9,4,8,0,0,3,7,2,0,0,0,0,9,1,0,0,1,1,0,5,6,3,1,6,0,0,2,3,4,7,0,3,9,3,6,5,8,9,1,1,3,2,0,0,7,3,3,0,5,7,0,8,1,9,6,3,0,8,8,8,8,0,0,5,0,0,0,3,7,7,7,7,5,1,0,0,8,0,0};
		int[] input = new int[] { 1, 5, 2, 0, 6, 8, 0, 6, 0 };

		System.out.println(input);
		duplicateZeros(input);
		System.out.println(input);
	}
}
