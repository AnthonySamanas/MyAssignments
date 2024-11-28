package week3day1;

public class OddIndexToUpperClass {
	
	public static void main(String[] args) {
		
		String input= "changeme"; //input characters
		
		char[] charArray= input.toCharArray();  //covert string to character array
	
		for (int i = charArray.length-1; i >= 0; i--) {  //loop for end to start
			
			if (i%2 != 0) {  //check if the index is odd
				charArray[i]= Character.toUpperCase(charArray[i]);
				
				
			}
			
		}
		
		System.out.println(new String(charArray)); //print the output array as a string
	}

}
