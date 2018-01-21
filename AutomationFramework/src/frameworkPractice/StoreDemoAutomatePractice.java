package frameworkPractice;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.classes.AutomationPractice;

public class StoreDemoAutomatePractice {
		
	private WebDriver driver;
	private String URL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		URL = "http://store.demoqa.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(URL);
		
		AutomationPractice.menuDropdownItem(driver);
		AutomationPractice.rate5StarClick(driver);
	}

	@After
	public void tearDown() throws Exception {
	}

}