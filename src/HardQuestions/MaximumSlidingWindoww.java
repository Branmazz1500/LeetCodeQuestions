package HardQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class MaximumSlidingWindoww {
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int[] result = new int[nums.length - k + 1];
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < k; i++) {
			set.add(nums[i]);
		}
		for (int i = k; i < nums.length + 1; i++) {
			result[i - k] = set.floor(Integer.MAX_VALUE);
			if (i < nums.length)
				set.add(nums[i]);
			if (set.size() >= k) {
				set.remove(nums[i - k]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] input = new int[] { -7, 0, 7, 5, 7, 1, 6, 0 };
		System.out.println(maxSlidingWindow(input, 4));
	}
}
