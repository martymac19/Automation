package testPackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.classes.pageFactorySearch;

public class frameworkTestCase {
	private WebDriver driver;
	private String URL;
	pageFactorySearch searchPage;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		URL = "https://www.expedia.co.uk/";
		
		searchPage = new pageFactorySearch(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		
	}
	
	@Test
	public void test() {
		searchPage.clickFlightsTab();
		searchPage.setOriginCity("London");
		searchPage.setDestinationCity("Paris");
	}

	@After
	public void tearDown() throws Exception {
	}

}
