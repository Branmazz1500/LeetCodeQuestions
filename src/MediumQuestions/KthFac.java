package MediumQuestions;

public class KthFac {
	 public static int kthFactor(int n, int k) {
	        int count = 0;
	        for(int i = 1; i<=n/2; i++){
	            count = n%i == 0 ? ++count : count;
	            if(count == k) return i;
	            if(i==n/2 && count == k-1) return n;
	        }
	        return -1;
	    }
	 public static void main(String[] args) {
		 System.out.println(kthFactor(12,3));
	 }
}
