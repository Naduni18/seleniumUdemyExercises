/**
 * 
 */
package demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/**
 * @author Naduni
 *
 */
public class Fluent_wait {
	

	public static void main(String[] args) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		// driver.findElement(By.xpath(""));

		driver.findElement(By.xpath("//div[@id='start']/button")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))// Fluent wait
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 if( driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()) {
		    		 return driver.findElement(By.xpath("//div[@id='finish']/h4"));
		    	 }else {
		    		 return null;
		    	 }
		     }
		   });
		
    System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed());
		driver.close();
		driver.quit();
	}	
}



/*
 WebElement	element = wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement applyfor(WebDriver driver) {
				return driver.findElement(By.xpath("//div[@id='finish']/h4"));
			}
			
		});
		
		*/
