package testPackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import page.classes.SearchPage;

public class pageObjectModel {	
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseURL = "http://www.expedia.co.uk";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		SearchPage.originTextBox(driver).sendKeys("New York");
		SearchPage.destinationTextBox(driver).sendKeys("Chicago");
		//SearchPage.returnDate(driver).sendKeys("10/02/2017");
		//SearchPage.departureDate(driver).sendKeys("01/02/2017");
		Thread.sleep(3000);
		SearchPage.clickOnSearchButton(driver);
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/*		remember when doing dates it could be: 
	American (mm/dd/yy -12/25/17) 
	or 
	British format (dd/mm/yy - 25/12/17)*/

}
