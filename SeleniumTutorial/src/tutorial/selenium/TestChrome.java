package tutorial.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {
    static private String baseURL;
    static private WebDriver driver;
    
    public static void main(String[] args) {
        // http://chromedriver.storage.googleapis.com/index.html
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");

    	driver = new ChromeDriver();
		baseURL = "https://www.expedia.co.uk/";
        
 }

}



