package DataStructure.String;

public class Palindrome {

	public static void main(String args[]) {
		isPalindrome("aabbaa");
		isPalindrome("aabsabaa");
		
	}
	
	
	
// input isPalindrome("radar")
	//output: radar is Palindrome String
	
	public static void isPalindrome(String str) {
		  String reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
	}
	
	
}
