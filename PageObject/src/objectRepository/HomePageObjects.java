/**
 * 
 */
package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Naduni
 *
 */
public class HomePageObjects {

	WebDriver driver;
	By searchBox = By.xpath("//input[@id='srchquery_tbox']");
	By searchBtn = By.xpath("//input[@id='srchquery_tbox']/following-sibling::input[1]");

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}
	public WebElement getSearchBtn() {
		return driver.findElement(searchBtn);
	}
}
