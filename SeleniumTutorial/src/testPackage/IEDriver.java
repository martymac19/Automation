package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;;


public class IEDriver {

	public static void main(String[] args) {
/*		System.setProperty("webdrive.ie.driver", "C:\\Selenium\\IE\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com");*/
        
        String baseURL = "http://www.google.co.uk";
        WebDriver driver;
        
        //System.setProperty("webdrive.ie.driver", "C:\\Selenium\\IE\\IEDriverServer.exe");
        
        driver = new InternetExplorerDriver();
        
        driver.get(baseURL);

	}

}
