/**
 * 
 */
package loanDepartment;

import org.testng.annotations.Test;

/**
 * @author Naduni
 *
 */
public class CarLoan {

	@Test
	public void login() {
		System.out.println("CarLoan login");
	}
	@Test
	public void mobile_login() {
		System.out.println("CarLoan mobile login");
	}
	
	@Test
	public void logout() {
		System.out.println("CarLoan logout");
	}
	
	@Test
	public void mobile_logout() {
		System.out.println("CarLoan mobile logout");
	}
	
	@Test(groups = {"smoke"})
	public void apply() {
		System.out.println("CarLoan apply");
	}
	
	@Test
	public void reject() {
		System.out.println("CarLoan reject");
	}
	
	@Test
	public void approve() {
		System.out.println("CarLoan approve");
	}
	
	@Test
	public void getClientDetails() {
		System.out.println("CarLoan client details get");
	}
	
	@Test
	public void setClientDetails() {
		System.out.println("CarLoan client details set");
	}
	
	@Test
	public void getLoanStatus() {
		System.out.println("CarLoan get loan status");
	}
	
	@Test
	public void setLoanStatus() {
		System.out.println("CarLoan set load status");
	}
	
	@Test
	public void sendOutstandingWarn() {
		System.out.println("CarLoan warning");
	}
	
	@Test
	public void setNewLoan() {
		System.out.println("CarLoan add new loan");
	}
	
	@Test
	public void removeLoan() {
		System.out.println("CarLoan delete loan");
	}
	
}
