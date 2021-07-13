/**
 * 
 */
package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.findElement(
				By.xpath("//h4[contains(text(),'Adults')]/following-sibling::select[1] //option[@value='3']")).click();
		driver.findElement(
				By.xpath("//h4[contains(text(),'Children')]/following-sibling::select[1] //option[@value='2']"))
				.click();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//a[contains(text(),'Class of travel, Airline preference')]")).click();
		driver.findElement(By.cssSelector("input[placeholder*='Airline name']")).sendKeys("sri");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//p[contains(text(),'SriLankan Airlines (UL)')]")).click();

		driver.findElement(By.xpath("//div[contains(@class,'homeCalender')]/button[1]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Day--today')]"));
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).isEnabled()) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//button[contains(text(),'Search flights')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'bg-error-600')]/span")).getText());
		driver.close();
		driver.quit();
	}
}
/*
 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * public class Assignment {
 * 
 * public static void main(String[] args) {
 * 
 * System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
 * WebDriver driver=new ChromeDriver(); driver.get("http://www.cleartrip.com/");
 * driver.findElement(By.id("DepartDate")).click(); driver.findElement(By.
 * cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click(
 * ); WebElement adult=driver.findElement(By.id("Adults")); Select s =new
 * Select(adult); s.selectByIndex(2); WebElement
 * ch=driver.findElement(By.id("Childrens")); Select s1 =new Select(ch);
 * s1.selectByIndex(2);
 * driver.findElement(By.xpath("//a[@title='More search options']")).click();
 * driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
 * driver.findElement(By.id("SearchBtn")).click();
 * System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * }
 */