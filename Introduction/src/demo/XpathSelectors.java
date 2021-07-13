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
public class XpathSelectors {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
//	XPath --- >  //tagName[@attribute='value']
	driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("my own xpath");
	
	//  pick any tag name XPath  --->  //*[@attribute='value']  
	driver.findElement(By.xpath("//*[@data-testid='royal_pass']")).sendKeys("123456789");
	driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();

	System.out.println(driver.getCurrentUrl());
	driver.close();
	driver.quit();
}
}

//if an attribute which has common value ( for example - <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data> - in this tag both name and id attributes has "email" as their value - common value) try not to use those attributes in XPath 

/*reguler expressions (when only partial unique identifier available)----->>>>

for XPath --->//tagName[@contains(@attribute,'value')]
for CSS   --->


example -
<input name="username002">

if every new update "002" changes then only unique part is "username" so,

xpath --> //input[@contains(@name,'username')]
css   --> 


*/