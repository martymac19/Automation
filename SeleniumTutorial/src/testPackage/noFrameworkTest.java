package testPackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.classes.*;

public class noFrameworkTest {
	private WebDriver driver;
	private String URL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		URL = "https://www.expedia.co.uk/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@Test
	public void test() {
		driver.findElement(By.id("header-history")).click();
		driver.findElement(By.id("tab-flight-tab")).click();
		driver.findElement(By.id("flight-origin")).sendKeys("London");
		driver.findElement(By.id("flight-destination")).sendKeys("Paris");
		driver.findElement(By.id("flight-departing")).sendKeys("20/03/2017");
		driver.findElement(By.id("flight-returning")).sendKeys("30/03/2017");
		driver.findElement(By.id("search-button")).click();
	}

	@After
	public void tearDown() throws Exception {
	}

}
