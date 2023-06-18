package DataStructure.String;

public class ReverseStringRecursion {

	public static void reverseString(String str, int idx) {
		if (idx >= str.length())
			return;
		reverseString(str, idx + 1);
		System.out.print(str.charAt(idx));
	}

	public static void main(String args[]) {
		reverseString("abcd", 0);
		System.out.println();
		reverseString("a", 0);
		System.out.println();
		reverseString("", 0);
	}
	
	
		
	
}
