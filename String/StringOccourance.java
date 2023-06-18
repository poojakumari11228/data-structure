package DataStructure.String;

public class StringOccourance {


	public static void main(String args[]) {
		
		System.out.println(StringOccourance("aahgvsra", 'a'));
		System.out.println(StringOccourance("Hargun", 'a'));
	}
	
	
	
	
	// input: StringOccourance("aahgvsra", 'a')
	//output: 3
	public static int StringOccourance(String input, char search) {
	    
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == search)
		      count++;
		  }
		  
		  return count;
	}
	
	
}
