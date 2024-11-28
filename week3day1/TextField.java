package week3day1;

public class TextField extends WebElement{
	public void getText() {
		System.out.println("Subclass getText method"); //subclass method
	}
	
	public static void main(String[] args) {
		TextField textfield= new TextField();
		textfield.click(); //from base class
		textfield.setText("TextField");
		textfield.getText();
	}

}
