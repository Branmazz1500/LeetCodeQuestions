package easyQuestions;

public class DuplicateRemoval {
	  public static int removeDuplicates(int[] nums) {
		  if (nums.length == 0) return 0;
		    int i = 0;
		    for (int j = 1; j < nums.length; j++) {
		        if (nums[j] != nums[i]) {
		            i++;
		            nums[i] = nums[j];
		        }
		    }
		    return i + 1;
	  }
	  public static void main(String[] args) {
		  int[] input = new int[] {1,2,2,3,4,5,5};
		  removeDuplicates(input);
	  }
}
