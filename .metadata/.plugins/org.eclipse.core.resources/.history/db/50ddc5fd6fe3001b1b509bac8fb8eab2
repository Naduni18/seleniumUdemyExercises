/**
 * 
 */
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Naduni
 *
 */
public class LandingPage {

	public WebDriver driver;

	private By signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By navbar = By.xpath("//ul[contains(@class,'navbar-right')]");
	//private By subheader = By.xpath("//div[contains(@class,'video-banner')]/p");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLogin() {

		driver.findElement(signin).click();
		LoginPage lp = new LoginPage(driver);
		return lp;

	}

	public WebElement getTitle() {

		return driver.findElement(title);

	}
	
/*	public WebElement getSubHeader() {

		return driver.findElement(subheader);

	} */

	public WebElement getNavBar() {

		return driver.findElement(navbar);

	}

}
