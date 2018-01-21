package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTestClass {

	public static void main(String[] args) {
		
        // http://chromedriver.storage.googleapis.com/index.html
        String baseURL = "http://www.google.com";
        WebDriver driver;

        //System.setProperty("webdriver.chrome.driver", "C://Users//maccormickd//workspace//SeleniumPractice//chromedriver.exe");
        
        driver = new ChromeDriver();
        
        driver.get(baseURL);


	}

}
