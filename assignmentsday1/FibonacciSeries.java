package assignmentsday1;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num=8, f1=0, f2=1;
		
		for (int i = 1; i <=num; ++i) {
			
		int nextnum= f1+f2;
		
		f1=f2;
		f2=nextnum;
		System.out.println(f1+",");
			
			
		}		
	}

}
