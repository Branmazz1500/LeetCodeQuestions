package easyQuestions;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        s=String.valueOf(sChar);
        t=String.valueOf(tChar);
        if(s.equals(t)){
            return true;
        }
        else return false;
    }
    
    public static void main(String[] args) {
    	String s = "anagram";
    	String t = "nagaram";
    	System.out.println(isAnagram(s,t));
    }
}
