package week3day1;

public class Button extends WebElement{
	public void submit() {
		System.out.println("Subclass method submit"); //sub class method
	}
	
	public static void main(String[] args) {
		Button button= new Button();
		button.click(); //from base class
		button.setText("Button");
		button.submit();
	}

}
