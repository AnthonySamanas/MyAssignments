package assignmentsday2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] a= {3, 2, 11, 4, 6, 7};  //first array
		int[] b= {1, 2, 8, 4, 9, 7};  //second array
		
		System.out.println("Matching Elements: ");
		
		for (int i = 0; i < a.length; i++) {  //iterate through each element of array 'a'
			
		for (int j = 0; j < b.length; j++) {  //iterate through each element of array 'b'
			
			if (a[i]==b[j]) {  //if elements are equal, print the matching elements
				
				System.out.println(a[i]+" ");
				
				break; //stop inner loop
				
				
			}
		}
		}
	}
}
