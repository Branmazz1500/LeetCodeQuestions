package easyQuestions;

public class max69Num {

	public static int maximum69Number(int num) {
		return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));
	}
	public static void main(String[] args) {
		System.out.println(maximum69Number(9966));
	}

}
