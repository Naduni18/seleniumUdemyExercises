/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class CSSselectors {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		// CSS selectors ---> tagName[attribute='value']  
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("my own css");
		// pick any tag name CSS ---> [attribute='value']  
		driver.findElement(By.cssSelector("[data-testid='royal_pass']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}
}
// below are non standards
/*other available syntaxes for CSS selector ---> tagName#id  OR with pick any tag name CSS ---> #id
                                            ---> tagName.classname  OR with pick any tag name CSS ---> .classname */
