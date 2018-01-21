package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public static WebElement element=null;
	
	//get flying-from textbox
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin"));
		return element;
	}
	
	//get flying-from textbox
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
	}
	
	//get flying-to textbox
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination"));
		return element;
	}
	
	//get departing date
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}
	
	//
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}
	
	//get search button
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("search-button"));
		return element;
	}
	
	/*
	 * click on search button
	 * paramater - driver
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		
		element = searchButton(driver);
		element.click();
		
	}
	
	
	/*
	 * navigate to flights tab
	 * paramater - driver
	 */
	public static void navigateToFlightsTab(WebDriver driver) {
		//click on header tab may not be needed
		//driver.findElement(By.id("header ID")).click();
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();
		
	}

}
