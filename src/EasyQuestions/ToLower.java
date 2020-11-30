package EasyQuestions;

public class ToLower {
  	public static String toLower(String str) {
		  StringBuilder sb = new StringBuilder();
		  char[] letters = str.toCharArray();
	        for(int i = 0; i<letters.length; i++){
	            letters[i] = letters[i] <= 'Z' && letters[i] >= 'A' ? 
                  (char) (((int) letters[i]) + 32) : letters[i];
	        }
	        for(char c : letters) {
	        	sb.append(c);
	        }
	        return sb.toString();
	
	}
	
	public static void main(String[] args) {
		String s = "Hello123445679";
		System.out.println(toLower(s));
	
	}
}
