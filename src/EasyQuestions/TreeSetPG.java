package EasyQuestions;

import java.util.TreeSet;

public class TreeSetPG {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int indDiff, int valDiff) {
		TreeSet<Long> set = new TreeSet<Long>();
		for (int i = 0; i < nums.length; i++) {
			Long floor = set.floor((long) nums[i]); // Smallest Number less then the num.
			Long cieling = set.ceiling((long) nums[i]); // Largest Number greater than num.
			if (floor != null) {
				if ((long) nums[i] - floor < valDiff) {
					return true;
				}
			}
			if (cieling != null) {
				if (cieling - (long) nums[i] > valDiff) {
					return true;
				}
			}
			set.add((long)nums[i]);
			if(set.size()>indDiff) {
				set.remove(nums[i-indDiff]);
			}
		}
		return false;
	}
}
