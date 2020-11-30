package MediumQuestions;

import java.util.*;
public class TestSuite {
	public static int recursion(List<Integer> list, int sum) {
		list.add(sum + list.get(0));
		return sum;
	}
	public static void main(String...strings) {
		List<Integer> test = new ArrayList<>();
		test.add(10);
		recursion(test, 5);
		
		recursion(test, 4);
		
		System.out.println("wtf");
	}
}
