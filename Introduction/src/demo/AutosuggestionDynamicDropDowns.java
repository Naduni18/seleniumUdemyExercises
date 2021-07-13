/**
 * 
 */
package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class AutosuggestionDynamicDropDowns {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.xpath(""));
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ir");
		Thread.sleep(2000L);
		List<WebElement> countryList = driver.findElements(By.cssSelector("li[class*='ui-menu-item'] a"));
		
		for(WebElement option :countryList) {
			
			if(option.getText().equals("ireland")) {
				option.click();
				break;
			}
		}
		Thread.sleep(2000L);
		driver.close();
		driver.quit();
	}	
	
}
