/**
 * 
 */
package loanDepartment;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author Naduni
 *
 */
public class BusinessLoan {

	@Test
	public void login() {
		System.out.println("BusinessLoan login");
	}
	@AfterSuite
	public void beforeSuitdo() {
		System.out.println("after suite");
	}
	@Test(groups = {"smoke"})
	public void mobile_login() {
		System.out.println("BusinessLoan mobile login");
	}
	
	@Test
	public void logout() {
		System.out.println("BusinessLoan logout");
	}
	
	@Test
	public void mobile_logout() {
		System.out.println("BusinessLoan mobile logout");
	}
	
	@Test
	public void apply() {
		System.out.println("BusinessLoan apply");
	}
	
	@Test
	public void reject() {
		System.out.println("BusinessLoan reject");
	}
	
	@Test
	public void approve() {
		System.out.println("BusinessLoan approve");
	}
	
	@Test
	public void getClientDetails() {
		System.out.println("BusinessLoan client details get");
	}
	
	@Test
	public void setClientDetails() {
		System.out.println("BusinessLoan client details set");
	}
	
	@Test
	public void getLoanStatus() {
		System.out.println("BusinessLoan get loan status");
	}
	
	@Test
	public void setLoanStatus() {
		System.out.println("BusinessLoan set load status");
	}
	
	@Test
	public void sendOutstandingWarn() {
		System.out.println("BusinessLoan warning");
	}
	
	@Test
	public void setNewLoan() {
		System.out.println("BusinessLoan add new loan");
	}
	
	@Test
	public void removeLoan() {
		System.out.println("BusinessLoan delete loan");
	}
}
