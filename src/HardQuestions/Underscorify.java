package HardQuestions;
import java.util.*;
public class Underscorify {
	public static String underscorifySubstring(String str, String substring) {
		StringBuilder sb = new StringBuilder(str.replaceAll(substring, "_" + substring + "_"));
		List<Integer> indexes = new ArrayList<Integer>();
		for(int i = 0; i<sb.length(); i++) {
			if(sb.charAt(i) == '_') {
				indexes.add(i);
			}
		}
		int first = -1;
		int k = 0;
		for(Integer index : indexes) {
				if(first != -1 && index-first < substring.length()) {
					sb.deleteCharAt(first-k);
					k++;
					sb.deleteCharAt(index-k);
					k++;
				}
				first = index;
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String test = "testthis is a testest to see if testestes it works";
		System.out.println(underscorifySubstring(test, "test"));
	}
}
