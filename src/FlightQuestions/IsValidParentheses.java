package FlightQuestions;

import java.util.Stack;

public class IsValidParentheses {
	public static boolean isValid(String s) {
		Stack<String> stack = new Stack<String>();
		for(int i = 0; i<s.length(); i++) {
			String character = s.substring(i,i+1);
			if(character.equals("(") || character.equals("{") || character.equals("[")) {
				stack.push(character);
			}else {
				if(character.equals(")")){
					if(!stack.pop().equals("(")){
						return false;
					}
				}else if(character.equals("}")) {
					if(!stack.pop().equals("{")){
						return false;
					}
				}else if(character.equals("]")) {
					if(!stack.pop().equals("[")){
						return false;
					}
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isValid("{[]}"));
	}
}
