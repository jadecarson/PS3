package CISC181.PracticeSet3;

import java.util.Date;

public class Account {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	public Account(int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public void setDateCreated(Date dateCreated){
		this.dateCreated=dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	public void setMonthlyInterestRate(){
	}
	
	public void withdraw(double Amount)throws InsufficientFundsException{
		if(Amount<=balance){
			balance-=Amount;
		}
		else{
			System.out.println("Insufficient funds");
			double needs=Amount-balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	public void Deposit(double Amount){
		balance+=Amount;
	}


}
