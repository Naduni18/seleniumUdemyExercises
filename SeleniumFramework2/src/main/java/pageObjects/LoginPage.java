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
public class LoginPage {

	public WebDriver driver;

	private By email = By.cssSelector("[id='user_email']");
	private By password = By.cssSelector("[type='password']");
	private By login = By.cssSelector("[value='Log In']");
	private By fogotPassword =By.cssSelector("a[href*='password/new']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {

		return driver.findElement(email);

	}
	
	public ForgotPasswordPage getFogotPassword() {

		driver.findElement(fogotPassword).click();
		ForgotPasswordPage fpp = new ForgotPasswordPage(driver);
		return fpp;

	}

	public WebElement getPassword() {

		return driver.findElement(password);

	}

	public WebElement getLogin() {

		return driver.findElement(login);

	}

}