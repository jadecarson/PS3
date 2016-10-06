package CISC181.PracticeSet3;

public class InsufficientFundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	public InsufficientFundsException(double amount){
		this.amount=amount;
	}
	public double getoverdrawn(){
		return amount;
	}

}
