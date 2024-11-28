package week3day1;

public class LoginTestData extends TestData{ //sub class calling from super class
	
	public static void main(String[] args) {
		
		LoginTestData subclass= new LoginTestData();
		
		subclass.enterCredentials(subclass.enterUsername(), subclass.enterPassword());
		
	}
	public String enterUsername() {
		return "AntuSam";
	}
	public String enterPassword() {
		return "Sam@008";
		
		
	}
}
