/**
 * 
 */
package demo;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class ShoppingCart {
	public static void main(String[] args) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// driver.findElement(By.xpath(""));
		String[] names = { "Cucumber", "Beetroot" };
		List itemsneeded = Arrays.asList(names);
		List<WebElement> el = driver.findElements(By.cssSelector("h4.product-name")); // 30 ITEMS
		int noOfItems = 0;
		for (int i = 0; i < el.size(); i++) {

			String[] name = el.get(i).getText().split("-");
			String formattedName = name[0].trim();

			if (itemsneeded.contains(formattedName)) {
				Thread.sleep(2000L);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(formattedName);
				noOfItems++;
			}
			if (noOfItems == names.length) {
				
				break;
			}

		}

		driver.close();
		driver.quit();
	}
}
