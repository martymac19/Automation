package testPackage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;;;

public class ExpediaPractice {
	WebDriver driver;
	String baseURL = "";

	@Before
	public void setUp() throws Exception {
		
		/*FirefoxProfile ff = new FirefoxProfile();
		ff.setPreference("network.proxy.type", ProxyType.AUTODETECT.ordinal());
		driver = new FirefoxDriver(ff);*/
		
		driver = new ChromeDriver();
		baseURL = "https://www.expedia.co.uk";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@Test
	public void test() throws InterruptedException {
		String URLCreateAccount =  "https://www.expedia.co.uk/user/createaccount";
		driver.navigate().to(URLCreateAccount);
		
		WebElement fName = driver.findElement(By.id("create-account-firstname"));
		fName.sendKeys("John");
		
		//Putting this in to see each value be filled out
		Thread.sleep(500);
		
		WebElement lName = driver.findElement(By.id("create-account-lastname"));
		lName.sendKeys("Smith");
		Thread.sleep(500);
		
		WebElement email = driver.findElement(By.id("create-account-emailId"));
		email.sendKeys("spaceman_no12@hotmail.com");
		Thread.sleep(500);
		
		WebElement password = driver.findElement(By.id("create-account-password"));
		password.sendKeys("MyPassword2");
		
		WebElement confirmPass = driver.findElement(By.id("create-account-confirm-password"));
		confirmPass.sendKeys("MyPassword2");
		Thread.sleep(500);
		
		WebElement checkTerms = driver.findElement(By.id("create-account-expedia-policy"));	
		//checkTerms.click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(checkTerms).click().build().perform();
		
		WebElement createAcc = driver.findElement(By.id("create-account-submit-button"));
		createAcc.click();
	}

	@After
	public void tearDown() throws Exception {
		//Thread.sleep(2000);
		//driver.quit();
	}

}
