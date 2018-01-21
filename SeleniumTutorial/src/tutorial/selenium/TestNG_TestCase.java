package tutorial.selenium;

import org.testng.annotations.Test;

import page.classes.SearchPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNG_TestCase {
	public WebDriver driver;
	private String URL;
  
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		URL = "https://www.expedia.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	
	@Test
	public void testMethod() {
		driver.get(URL);

	}
  

  
	@AfterMethod
	public void afterMethod() {
	}

}
