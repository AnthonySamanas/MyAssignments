package week3day1;

public class ReverseOddWords {

	public static void main(String[] args) {

		
		String test= "I am a software tester"; //input string
		String[] words= test.split(" ");  //split string to words
		String result= " ";
		
		for (int i = 0; i < words.length; i++) {  //loop through words
			if (i%2!=0) {
				String reversed= new StringBuilder(words[i]).reverse().toString();
				result += reversed + " ";
				
				}else {
					result += words[i] + " ";				
			}
					
		}
		System.out.println(result.trim());  //remove the spaces
			
	}
			
}
