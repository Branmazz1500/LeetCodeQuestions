package easyQuestions;

public class StringShuffler {
	 public static String restoreString(String s, int[] indices) {
	   char[] chars = new char[s.length()];
	   for(int i = 0; i<indices.length; i++) {
		   chars[indices[i]] = s.charAt(i);
	   }
	   return String.valueOf(chars);
	 
	 }
	 /*
	  * s = "aiohn", indices = [3,1,4,2,0]
	  * [0,1,2,3,4]
		Output: "nihao"
	  */
	 public static void main(String[] args) {
		 int[] test = new int[] {3,1,0,2};
		 System.out.println(restoreString("ABCD",test));
	 }
}
