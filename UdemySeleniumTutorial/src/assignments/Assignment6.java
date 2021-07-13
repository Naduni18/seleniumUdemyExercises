/**
 * 
 */
package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author Naduni
 *
 */
public class Assignment6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		List<WebElement> listrows = driver.findElements(By.xpath("//table[@class='table-display']//tr"));
		List<WebElement> listcols = driver.findElements(By.xpath("//table[@class='table-display']//tr[1]//th"));
		System.out.println(listrows.size());
		System.out.println(listcols.size());
		WebElement row2 = listrows.get(2);
		List<WebElement> listcells = row2.findElements(By.tagName("td"));
		for (int i = 0; i < listcols.size(); i++) {

			String eleTxt = listcells.get(i).getText();
			System.out.println(eleTxt);

		}
		driver.close();
		driver.quit();
	}
}
