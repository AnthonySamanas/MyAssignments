package week3day1;

public class TestData {  //Super class
	
	public void enterCredentials(String Username, String Password) { //1st method
		System.out.println("Enter your ID "+ Username +"Set your Password "+ Password);
	}
	
	public void navigateToHomePage() {  //2nd method
		System.out.println("Navigated to new page");
	}

	public static void main(String[] args) {
		
		TestData sc= new TestData();
		sc.enterCredentials("AntuSam", "Sam@008");
		sc.navigateToHomePage();
	}
}
