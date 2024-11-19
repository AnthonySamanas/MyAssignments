package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccWithSelCls {

	public static void main(String[] args) {

ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.get("http://leaftaps.com/opentaps/");  //launch url
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");  //using id to enter username 
		driver.findElement(By.id("password")).sendKeys("crmsfa");  //using id to enter pass
		driver.findElement(By.xpath("//input[contains(@class,'Sub')]")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Antu2");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		Select opt0= new Select(driver.findElement(By.name("industryEnumId")));  
		opt0.selectByIndex(2); //select an option by index method
		
		Select opt1= new Select(driver.findElement(By.name("ownershipEnumId")));
		opt1.selectByVisibleText("S-Corporation");  //select an option by visible text method
		
		Select opt2= new Select(driver.findElement(By.id("dataSourceId")));
		opt2.selectByValue("LEAD_EMPLOYEE"); //select an option by value method

		Select opt3= new Select(driver.findElement(By.id("marketingCampaignId")));
		opt3.selectByIndex(5); //select an option by index method
		
		Select opt4= new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		opt4.selectByValue("TX"); //select an option by value method
		
		driver.findElement(By.className("smallSubmit")).click(); //click on create acc button
		
		String title = driver.getTitle();
		System.out.println("page Title is : "+title);
		driver.close();
	}

}
