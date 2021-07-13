/**
 * 
 */
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * @author Naduni
 *
 */
public class Assignment5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String s = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
		System.out.println(s);
		WebElement ele = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(s);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String[] s2 = driver.switchTo().alert().getText().split(" ");
		String[] s3 = s2[1].split(",");
		System.out.println(s3[0]);
		Assert.assertEquals(s3[0], s);
		driver.close();
		driver.quit();
	}
}
