package MediumQuestions;
import java.util.*;
public class abcSubStrings {
	public static int numberOfSubstrings(String s) {
        Set<Character> set = new HashSet<Character>();
        int result = 0;
        for(int i = s.length()-1; i>=0; i--){
            set.add(s.charAt(i));
            if(set.size() == 3) result += i + 1;
            if(i <= s.length()-3) set.remove(s.charAt(i+2));
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(numberOfSubstrings("aaabaabcacccbaaabaccaacbcabaccbacababbac"));
	}
	
	/*
	 *  abcabc
	 */
}

