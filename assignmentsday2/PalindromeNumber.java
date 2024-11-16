package assignmentsday2;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num=121; //we can change the given numbers and check the palindrome or not
		int originalNum= num;  //save the original number to compare later
		int reversedNum= 0;
		
		for (int temp = num; temp != 0; temp/=10) {   //reverse the number to using the loop
			
			int digit= temp % 10; //get the last digit
			
			reversedNum = reversedNum * 10 + digit;  //build the reverse number
			
		}
		
		if (originalNum == reversedNum) {   //compare the original number with reversed number
			System.out.println(num+ "is a palindrome");
			
		}
		else 
		{
			System.out.println(num+ "is not a palindrome");
		}
		
	
	}

}
