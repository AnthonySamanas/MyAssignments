package assignmentsday2;

public class FindMissingElements {

	public static void main(String[] args) {

		int[] a= {1,4,3,2,8,6,7};
			
	java.util.Arrays.sort(a); //sort the array to make the missing number easier to find
	
	int numbr=1; //numbr is the first number in the sequence
	
	for (int i = 0; i < a.length; i++) { //iterate through the sorted array and check the missing number
		
		if (a[i]!=numbr) { //when the number doesn't match the expected we have found the missing number
			
			System.out.println("Missing elements is: "+numbr);
			
			return; //exit the method as we found the missing number
	
		}
		
		numbr++; //increment the expected number for the next iteration
	}
		
	System.out.println("Missing elements is: "+numbr);

	}
		
	}
