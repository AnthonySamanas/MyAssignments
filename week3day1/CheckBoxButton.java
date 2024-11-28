package week3day1;

public class CheckBoxButton extends Button{
	public void clickCheckButton() {
		System.out.println("Click sumit button"); //subclass click submit button
	}
	
	public static void main(String[] args) {
		CheckBoxButton gc= new CheckBoxButton();
		gc.click(); //from base class
		gc.setText("Check Box Button");
		gc.submit();  //from button
		gc.clickCheckButton();
	}

}
