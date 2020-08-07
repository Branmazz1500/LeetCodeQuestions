package mediumQuestion;

public class MaxArea {
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxArea = getArea(left, right, height);
		while (left < right) {
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
			maxArea = Math.max(maxArea, getArea(left, right, height));
		}
		return maxArea;
	}

	public static int getArea(int left, int right, int[] arr) {
		int smallerHeight = Math.min(arr[left], arr[right]);
		return smallerHeight * (right - left);
	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(input));
	}
}
