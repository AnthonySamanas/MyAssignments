package week3day1;

public class RadioButton extends Button{
	public void selectRadioButton() {
		System.out.println("Select Radio Button"); //sub class method
	}
	
	public static void main(String[] args) {
		RadioButton gc= new RadioButton();
		gc.click();  //from base class
		gc.setText("Radio Button"); 
		gc.submit();  //from button
		gc.selectRadioButton();
	}

}
