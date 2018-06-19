package JenkinPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Jenkinclass1 {
	WebDriver driver;
	
	@BeforeMethod
	
	public void base()
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.freecrm.com");	
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("crm123");
		driver.findElement(By.name("password")).sendKeys("crm123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
