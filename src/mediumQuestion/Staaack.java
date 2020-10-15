package mediumQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Staaack {
	// Feel free to add new properties and methods to the class.
	static class MinMaxStack {

		List<Map<String, Integer>> minMax = new ArrayList<Map<String, Integer>>();
		List<Integer> stack = new ArrayList<Integer>();

		public int peek() {
			return stack.get(stack.size() - 1);
		}

		public int pop() {
			int pop = stack.get(stack.size() - 1);
			stack.remove(stack.size() - 1);
			minMax.remove(minMax.size() - 1);
			return pop;
		}

		public void push(Integer number) {
			stack.add(number);
			Map<String, Integer> map = new HashMap<String, Integer>();
			if (minMax.size() == 0) {
				map.put("min", number);
				map.put("max", number);
				minMax.add(map);
			} else {
				int min = minMax.get(minMax.size()-1).get("min");
				int max = minMax.get(minMax.size()-1).get("max");
				
				
				if (min > number) {
					map.put("min", number);
				}else {
					map.put("min",min);
				}
				if (max < number) {
					map.put("max", number);
				}else {
					map.put("max",max);
				}
				minMax.add(map);
			}
		}

		public int getMin() {
			return minMax.get(minMax.size() - 1).get("min");
		}

		public int getMax() {
			return minMax.get(minMax.size() - 1).get("max");

		}
	}
	
	public static void main(String[] args) {
		MinMaxStack stack = new MinMaxStack();
		stack.push(5);
		stack.getMin();
		stack.getMax();
		stack.peek();
		stack.push(7);
		stack.getMin();
		stack.getMax();
		stack.peek();
		stack.push(2);
		stack.getMin();
		stack.getMax();
		stack.pop();
		stack.getMax();
		stack.getMin();
	}
}
