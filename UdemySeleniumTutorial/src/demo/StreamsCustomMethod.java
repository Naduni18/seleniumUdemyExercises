/**
 * 
 */
package demo;
//
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
/*
 * @author Naduni
 */
public class StreamsCustomMethod {
	/*
	 * @param args
	 */
	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//th[1]")).click();	
		List<WebElement> original = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> ss = original.stream().filter(s->s.getText().contains("Beans")).map(s->getPrice(s)).collect(Collectors.toList());
		ss.stream().forEach(s-> System.out.println(s));
		driver.close();
		driver.quit();
	}
	private static String getPrice(WebElement s) {
	return	s.findElement(By.xpath("following-sibling::td[1]")).getText();	
	}
}
