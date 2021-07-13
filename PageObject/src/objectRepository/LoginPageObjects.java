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
public class LoginPageObjects {

	WebDriver driver;
	
	By username = By.xpath("//input[@id='login1']");
	By password = By.id("password");
	By submitBtn = By.xpath("//input[@name='proceed']");
	By homePageLink = By.xpath("//a[contains(text(),'rediff.com')]");
	
	public LoginPageObjects(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getEmailInputBox() {
		return driver.findElement(username);
	}
	
	public WebElement getPasswordInputBox() {
		return driver.findElement(password);
	}
	
	public WebElement getSubmitBtn() {
		return driver.findElement(submitBtn);
	}
	
	public WebElement getHomePageLink() {
		return driver.findElement(homePageLink);
	}
	
}
