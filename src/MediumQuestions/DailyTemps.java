package MediumQuestions;
import java.util.*;
public class DailyTemps {
	 public static int[] dailyTemperatures(int[] temperatures) {
		 	int[] ret = new int[temperatures.length];
		 	Stack<Integer> stack = new Stack<>();
		 	for(int i = 0; i<temperatures.length; i++) {
		 		while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
		 			int idx = stack.pop();
		 			ret[i] = i-idx;
		 		}
		 		
		 		stack.push(i);
		 	}
		    return ret;
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(dailyTemperatures(new int[] {73,74,75,71,69,72,76,73}));
	 }
}
