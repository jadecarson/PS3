package CISC181.PracticeSet3;

import java.util.Date;
import org.junit.Test;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
	int id=1122;
	double balance=20000;
	double annualInterestRate=4.5;
	
	@Test
	public void depositTest(){
		Account Account=new Account(id,balance);
		balance += 3000;
		Account.Deposit(3000);
		assertEquals(balance,Account.getBalance(), 0.1);
	}
	
	@Test
	public void withdrawTest() throws InsufficientFundsException{
		Account Account=new Account(id,balance);
		balance-=2500;
		Account.Deposit(2500);
		assertEquals(balance,Account.getBalance(),0);
	}
	
	@Test(expected=InsufficientFundsException.class)
	public void testOverdraft() throws InsufficientFundsException{
		Account Account=new Account(id,balance);
		Account.withdraw(99999999);
	}
	
	@Test
	public void Print(){
		Account acc=new Account(id, annualInterestRate);
		double balance=acc.getBalance();
		Date dateCreated=acc.getDateCreated();
		System.out.print(
				"Balance is $"+balance+" Monthly Interest is "+annualInterestRate+"%"+"Date is "+dateCreated);
	}


}
