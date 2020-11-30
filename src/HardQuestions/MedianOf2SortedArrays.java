package HardQuestions;

import java.util.LinkedList;

public class MedianOf2SortedArrays {
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 	int middlePoint = ((nums1.length + nums2.length)%2==0) ? 
		 			((nums1.length + nums2.length)/2 ) : ((nums1.length + nums2.length)/2 ) + 1;
		 	int count = 0;
		 	int nums1Pos = 0;
	        int nums2Pos = 0;
	        int val = 0;
	        int median = 0;
	        while(nums1Pos < nums1.length || nums2Pos < nums2.length) {
	        	if(nums1Pos < nums1.length && nums2Pos < nums2.length 
	        			&& nums1[nums1Pos] < nums2[nums2Pos]) {
	        		val = nums1[nums1Pos];
	        		nums1Pos++;
	        	}else if(nums1Pos < nums1.length && nums2Pos < nums2.length 
	        			&& nums1[nums1Pos] > nums2[nums2Pos]) {
	        		val = nums2[nums2Pos];
	        		nums2Pos++;

	        	}else if(nums1Pos<nums1.length) {
	        		val = nums1[nums1Pos];
	        		nums1Pos++;

	        	}else {
	        		val = nums2[nums2Pos];
	        		nums2Pos++;

	        	}
	        	count++;
	        	
	        	if(count == middlePoint) {
	        		median = val;
	        	}
	        	if(count == middlePoint + 1) {
	        		if((nums1.length + nums2.length)%2 == 1) {
	        			return median;
	        		}else {
	        			return (median + val)/2.0;
	        		}
	        	}
	        	
	        }
	        
	        return median;
	 }
	 
	 public static void main(String[] args) {
		 int[] l1 = new int[] {};
		 int[] l2 = new int[] {0};

		 System.out.println(findMedianSortedArrays(l1, l2));
	 }
}
