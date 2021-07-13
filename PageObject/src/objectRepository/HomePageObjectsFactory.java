/**
 * 
 */
package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Naduni
 *
 */
public class HomePageObjectsFactory {

	WebDriver driver;
	
	@FindBy(xpath ="//input[@id='srchquery_tbox']")
	WebElement searchBox;
	
	@FindBy(xpath ="//input[@id='srchquery_tbox']/following-sibling::input[1]")
	WebElement searchBtn;
	public HomePageObjectsFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
}
