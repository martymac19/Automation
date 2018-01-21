package testPackage;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	private WebDriver driver;
	private String URL1;
	private String URL2;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		URL1 = "http://www.expedia.co.uk/";
		URL2 = "http://www.htmlcodetutorial.com/forms/_SELECT_MULTIPLE.html";
		
		//maximize browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
/*	@Test
	public void test1() {
		driver.get(URL1);
		
		//click the flights tab
		WebElement clickBtn = driver.findElement(By.id("tab-flight-tab"));
		clickBtn.click();
		
		Select sel1 = new Select(driver.findElement(By.id("flight-adults")));
		Select sel2 = new Select(driver.findElement(By.id("flight-children")));
		
		List<WebElement> options = sel1.getOptions();
		int size = options.size();
		
		for (int i=0; i<size; i++) {
			String Name = sel1.getOptions().get(i).getText();
			System.out.println(Name);
		}
		
		//by Value
		sel1.selectByValue("2");
		
		//by Index
		sel2.selectByIndex(2);
	}*/
	
	@Test
	public void test2() {
		driver.get(URL2);
		Select sel = new Select(driver.findElement(By.name("toppings")));
		sel.selectByValue("onions");
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
	}

}
 