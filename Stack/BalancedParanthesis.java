package DataStructure.Stack;

import java.util.Stack;

//  ((()()(())))

public class BalancedParanthesis {

	public boolean isBalancedParanthesis(String brackets) {

		Stack<Character> stack = new Stack<>();

		if (brackets.startsWith(")") || brackets.endsWith("("))
			return false;

		for (char c : brackets.toCharArray()) {
			if (isOpeningParanthesis(c + ""))
				stack.push(c);
			else {
				if (stack.isEmpty() || stack.pop() != '(')
					return false;
			}
		}

		if (!stack.isEmpty())
			return false;

		return true;
	}

	private boolean isOpeningParanthesis(String bracket) {
		if (bracket.equals("("))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		BalancedParanthesis b = new BalancedParanthesis();
		System.out.println(b.isBalancedParanthesis("((()()(())))"));
	}

}
