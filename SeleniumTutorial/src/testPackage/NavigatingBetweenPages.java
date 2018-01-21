package testPackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingBetweenPages {
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
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentURL);
		
		String URLToNaviate = "https://sso.teachable.com/secure/42299/users/"
				+ "sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(URLToNaviate);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentURL);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate forward");
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentURL);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentURL);
		
		driver.navigate().refresh();
		System.out.println("Navigate refresh");
		driver.get(currentURL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
