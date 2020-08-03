package easyQuestions;

public class StringShuffler {
	 public static String restoreString(String s, int[] indices) {
	     
		 StringBuilder sb = new StringBuilder();
		 String result = "";
		 for(int i = 0; i < indices.length; i++) {
			 String letter = s.substring(indices[i],indices[i]+1);
			 sb.append(letter);
	     }
		 return String.valueOf(sb);
	    }
	 
	 public static void main(String[] args) {
		 int[] test = new int[] {3,1,0,2};
		 System.out.println(restoreString("ABCD",test));
	 }
}
