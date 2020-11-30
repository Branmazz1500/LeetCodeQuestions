package EasyQuestions;

public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int startPoint = -1;
        int endPoint = -1;
        for(int i = 0; i< nums1.length; i++){
            int num = nums1[i];
            int currI = i;
            for(int j = 0; j<nums2.length; j++){
                if(nums2[j] == nums1[currI]){
                    startPoint = startPoint >= 0 ? startPoint : j;
                    if(i + 1 < nums1.length){
                    	currI++;
                    }
                }
                if(startPoint >= 0){
                    endPoint = j;
                    break;
                }
            }
            if(endPoint > 0) {
            	break;
            }
        }
        
    
        int[] intersect = endPoint > 0 ? new int[endPoint-startPoint+1] : new int[0];
      
        if(startPoint >= 0 && endPoint >= 0){
            for(int i = startPoint; i<=endPoint; i++){
             intersect[i] = nums2[i];
            }
        }
        return intersect;
    }
    
    public static int hammingWeight(int n) {
        String N = String.valueOf(n);
        int ct = N.length();
        return ct;
    }
    
    public static void main(String[] args) {
    	int[] l1 = new int[] {4,9,5};
    	int[] l2 = new int[] {9,4,9,8,4};
    	System.out.println(hammingWeight(0000000000000000000000000001011));
    	System.out.println(intersect(l1,l2));
    }
}
