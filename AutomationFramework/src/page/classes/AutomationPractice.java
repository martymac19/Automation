package page.classes;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomationPractice {
	public static WebElement element=null;
	
	//find the text box element by name "s"
	public static WebElement searchBoxFind (WebDriver driver) {
		element = driver.findElement(By.name("s"));
		return element;
	}
	
	/*
	 * Get textbox name from searchBoxFind
	 * Send keys to enter name to text box - param origin
	 */
	public static void SearchBoxFill(WebDriver driver, String origin) {
		element = searchBoxFind(driver);
		element.sendKeys(origin);
	}
	
	
	//get all product by ID
	public static WebElement prodCategory72 (WebDriver driver) {
		element = driver.findElement(By.id("menu-item-72"));
		return element;
	}
	
	//click on all product category
	public static void clickCategory72(WebDriver driver) {
		element = prodCategory72(driver);
		element.click();
	}

	//get search button
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.name("post_type"));
		return element;
	}
	
	/*
	 * This code presses enter after the search item entered
	 * paramater - driver
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		element.sendKeys(Keys.RETURN);
	}
	

	/*
	 * This uses mouse hover on product category to show the hidden menu 
	 * It then clicks menu-item 36 (ipads)
	 */
	public static void menuDropdownItem(WebDriver driver) {
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id='menu-item-33']"));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-36']"))).click().build().perform();
	}
	
	
	//Find the id for 5 star rating for magic mouse using xpath
	public static WebElement rate5Star(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='default_products_page_container']/div[3]/div[2]/div[2]/span/div[6]"));
		return element;
	}
	
	//click the 5 star rating for magic mouse using xpath
	public static void rate5StarClick (WebDriver driver) {
		element = rate5Star(driver);
		element.click();
	}
	
	
	//find the id for the grid layout on the iPads page
	public static WebElement gridList(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='default_products_page_container']/div[1]/div/a[1]"));
		return element;
	}


}

