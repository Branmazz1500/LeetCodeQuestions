package easyAugust7th;

public class StringReverse {
	public static String reverseWords(String s) {
		int startOfWord = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				s = reverseWord(s, startOfWord, i-1);
				startOfWord = i + 1;
			}
			if(i == s.length()-1) {
				s = reverseWord(s,startOfWord,s.length()-1);
			}
		}
		return s;
	}

	public static String reverseWord(String s, int start, int end) {
		char[] sChars = s.toCharArray();
		while(start<end) {
			char startC = sChars[start];
			char endC = sChars[end];
			sChars[start] = endC;
			sChars[end] = startC;
			start++;
			end--;
		}
		return String.valueOf(sChars);

	}

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
}
