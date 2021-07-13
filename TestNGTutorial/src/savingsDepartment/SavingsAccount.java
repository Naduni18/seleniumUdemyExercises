/**
 * 
 */
package savingsDepartment;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Naduni
 *
 */
public class SavingsAccount {
	@Test
	public void login() {
		System.out.println("savings Account login");
	}
	@Test
	public void mobile_login() {
		System.out.println("savings Account mobile login");
	}
	
	@Test(groups = {"smoke"})
	public void logout() {
		System.out.println("savings Account logout");
	}
	
	@Test(dataProvider = "getData")
	public void mobile_logout(String u, String p) {
		System.out.println("savings Account mobile logout "+ u + " - "+p);
	}
	@BeforeMethod
	public void beforeMethoddo() {
		System.out.println("before method");
	}
	
	@BeforeClass
	public void beforeClassdo() {
		System.out.println("before class");
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] dataSets = new Object[3][2]; 
		// rows - number of data combinations - 3 , columns - number of input values in a data set combination -2
		
		dataSets[0][0] = "username1";
		dataSets[0][1] = "password1"; // 1st row 2nd column
		
		dataSets[1][0] = "username2";
		dataSets[1][1] = "password2"; 
		
		dataSets[2][0] = "username3";
		dataSets[2][1] = "password3"; 
		return dataSets;
	}
}
