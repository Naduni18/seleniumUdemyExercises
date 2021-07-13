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
public class LoginPageObjectsFactory {

	WebDriver driver;
	
	@FindBy(xpath ="//input[@id='login1']")
	WebElement username;
	
	@FindBy(id ="password")
	WebElement password;
	
	@FindBy(xpath ="//input[@name='proceed']")
	WebElement submitBtn;
	
	@FindBy(xpath ="//a[contains(text(),'rediff.com')]")
	WebElement homePageLink;
	
	public LoginPageObjectsFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmailInputBox() {
		return username;
	}
	
	public WebElement getPasswordInputBox() {
		return password;
	}
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public WebElement getHomePageLink() {
		return homePageLink;
	}
	
}
