package week3day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		String text1= "stops"; //1st input text
		String text2= "potss"; //2nd input text
		
		if (text1.length() != text2.length()) { //check the string length is equal or not
			System.out.println("Lengths mismatch, so the given string are not an Anagram");
			return;
			
		}
		
		char[] charArray1= text1.toCharArray(); //converts string to character array
		char[] charArray2= text2.toCharArray();
		
		Arrays.sort(charArray1);  //sort both arrays
		Arrays.sort(charArray2);
		
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("The given Strings are Anagram");
			
		}else {
			System.out.println("The given String are not an Anagram");
		}
		
	}

}
