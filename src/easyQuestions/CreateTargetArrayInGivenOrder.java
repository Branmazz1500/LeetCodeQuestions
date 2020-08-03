package easyQuestions;

import java.util.ArrayList;

public class CreateTargetArrayInGivenOrder {
	public static int[] createTargetArray(int[] nums, int[] index) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i<index.length; i++) {
			a.add(index[i], nums[i]);
		}
		int[]result = new int[a.size()];
		for(int i = 0; i<a.size(); i++) {
			result[i] = a.get(i);
		}
		return result;
    }
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,0};
		int[] index = new int[] {0,1,2,3,0};
		System.out.println(createTargetArray(nums,index));
	}
}
