package easyAugust7th;

public class FreqAlphabet {
	 public static String freqAlphabets(String s) {
		 String output = "";
		 int difference = 'a' - 1;
	     for(int i = 0; i<s.length(); i++) {
	    	 if(i <= s.length()-3 && s.substring(i, i+3).contains("#")) {
	    		 String letter = (s.substring(i, i+2));
	    		 Integer letterInt = Integer.parseInt(letter) + difference;
	    		 output += (char)(int) letterInt;
	    		 i+=2;
	    		 
	    	 }else {
	    		 Integer letter = Integer.parseInt(s.substring(i,i+1)) + difference;
	    		 output += (char)(int)letter;
	    	 }
	     }
		 return output;
	    }
	 
	 public static void main(String[] args) {
		 String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
		 System.out.println(freqAlphabets(s));
	 }
	 
	 
}
