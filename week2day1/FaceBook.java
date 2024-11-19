package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {

ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		driver.get("https://en-gb.facebook.com/");  //launch url
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Antu");  //entering first-name
		driver.findElement(By.name("lastname")).sendKeys("Sam");  //entering sur-name
		driver.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("9790904256");  //entering mobile/email details
		
		//entering DOB using by select methods
		Select opt0= new Select(driver.findElement(By.id("day")));
		opt0.selectByVisibleText("30");  //select an option by visible text method
		
		Select opt1= new Select(driver.findElement(By.id("month")));  
		opt1.selectByIndex(4); //select an option by index method
		
		Select opt2= new Select(driver.findElement(By.id("year")));
		opt2.selectByValue("1990"); //select an option by value method
		
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("Varghese@123");  //entering password
		
		driver.findElement(By.xpath("//input[@value='2']")).click();  //select gender and handling radio by xpath


	}

}
