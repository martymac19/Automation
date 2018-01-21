package testPackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "http://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.cssSelector("a[href*='/sign_in']")).click();
		System.out.println("Clicked on Login");		
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("Martin@test.com");
		System.out.println("Sending keys to username field");
		driver.findElement(By.id("user_password")).sendKeys("password");
		System.out.println("sending keys to password field");
		driver.findElement(By.id("user_email")).clear();
		System.out.println("Clearing username field");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}


}
