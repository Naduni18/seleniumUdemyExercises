/**
 * 
 */
package demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class Implicit_wait {
	public static void main(String[] args) throws InterruptedException{
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); // implicit wait
		
		String[] names = { "Cucumber", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addItems(driver,names);
		// driver.findElement(By.xpath(""));
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.close();
		driver.quit();
	}
	
	public static void addItems(WebDriver driver,String[] names) throws InterruptedException {
		
		
		// driver.findElement(By.xpath(""));
		
		List itemsneeded = Arrays.asList(names);
		List<WebElement> el = driver.findElements(By.cssSelector("h4.product-name")); // 30 ITEMS
		int noOfItems = 0;
		for (int i = 0; i < el.size(); i++) {

			String[] name = el.get(i).getText().split("-");
			String formattedName = name[0].trim();

			if (itemsneeded.contains(formattedName)) {
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(formattedName);
				noOfItems++;
			}
			if (noOfItems == names.length) {
				
				break;
			}
	}
	}
}
