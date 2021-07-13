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
public class ForgotPasswordPage {

	public WebDriver driver;

	private By email = By.cssSelector("[id='user_email']");
	private By sendMeInstructionsBtn = By.cssSelector("[value='Send Me Instruction']");
	

	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {

		return driver.findElement(email);

	}
	
	public WebElement getsendMeInstructionsBtn() {

		return driver.findElement(sendMeInstructionsBtn);

	}
	
}
