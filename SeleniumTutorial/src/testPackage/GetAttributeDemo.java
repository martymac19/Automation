package testPackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {
	
	private WebDriver driver;
	private String URL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		URL = "https://letskodeit.teachable.com/pages/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.get(URL);
		
		WebElement element = driver.findElement(By.id("name"));
		String attributevalue = element.getAttribute("type");
		
		System.out.println("Value of attribute is: " + attributevalue);
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
