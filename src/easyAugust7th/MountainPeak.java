package easyAugust7th;

public class MountainPeak {
	  public static int peakIndexInMountainArray(int[] A) {
	        int lo = 0, hi = A.length - 1;
	        while (lo < hi) {
	            int mi = lo + (hi - lo) / 2;
	            if (A[mi] < A[mi + 1])
	                lo = mi + 1;
	            else
	                hi = mi;
	        }
	        return lo;
	    }
	  public static void main(String[] args) {
		  int[] in = new int[] {0,10,5,2};
		  System.out.println(peakIndexInMountainArray(in));
	  }
}
