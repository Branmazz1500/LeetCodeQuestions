package EasyQuestions;

public class IncreasingDecreasingArrra {

	public static String sortString(String s) {
		StringBuilder sb = new StringBuilder();
		int[] letterCount = new int[26];
		int count = s.length();
		for (int i = 0; i < s.length(); i++) {
			letterCount[s.charAt(i) - 'a']++;
		}
		while (count != 0) {
			for (int i = 0; i<letterCount.length; i++) {
				if (letterCount[i] > 0) {
					sb.append((char) (i + (int) 'a'));
					letterCount[i]--;
					count--;
				}
			}
			for (int i = 25; i >= 0; i--) {
				if (letterCount[i] > 0) {
					sb.append((char) (i + (int) 'a'));
					letterCount[i]--;
					count--;
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String test = "aaaabbbbcccc";
		System.out.println(sortString(test));
		
	}
}
