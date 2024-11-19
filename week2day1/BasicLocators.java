package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		driver.get("http://leaftaps.com/opentaps/");  //launch url
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");  //using id to enter username 
		driver.findElement(By.id("password")).sendKeys("crmsfa");  //using id to enter pass
		driver.findElement(By.xpath("//input[contains(@class,'Sub')]")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Antu");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("8");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println("page Title is : "+title);
		driver.close();
		
		
		
	}

}
