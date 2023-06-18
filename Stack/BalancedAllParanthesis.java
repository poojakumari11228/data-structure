package DataStructure.Stack;

import java.util.Stack;

//  (({}[]{([()])}))

public class BalancedAllParanthesis {

	public static char[][] allowedParanthesis = { { '{', '}' }, { '(', ')' }, { '[', ']' } };

	public boolean isBalancedParanthesis(String brackets) {

		Stack<Character> stack = new Stack<>();

		if (!isEndingParanthesis(brackets.charAt(brackets.length() - 1)) || !isOpeningParanthesis(brackets.charAt(0)))
			return false;

		for (char c : brackets.toCharArray()) {
			if (isOpeningParanthesis(c))
				stack.push(c);
			else {
				if (stack.isEmpty() || !matches(stack.pop(), c))
					return false;
			}
		}

		if (!stack.isEmpty())
			return false;

		return true;
	}

	public boolean isOpeningParanthesis(char c) {

		for (int i = 0; i < allowedParanthesis.length; i++) {
			if (c == allowedParanthesis[i][0])
				return true;
		}
		return false;
	}

	public boolean isEndingParanthesis(char c) {
		for (int i = 0; i < allowedParanthesis.length; i++) {
			if (c == allowedParanthesis[i][1])
				return true;
		}
		return false;
	}
	
	public boolean matches(char open, char close) {
		for (int i = 0; i < allowedParanthesis.length; i++) {
			if (open == allowedParanthesis[i][0])
				return allowedParanthesis[i][1]==close;
		}
		return false;
	}

	public static void main(String[] args) {

		BalancedAllParanthesis b = new BalancedAllParanthesis();
		System.out.println(b.isBalancedParanthesis("(({}[]{([()])}))"));
	}

}
