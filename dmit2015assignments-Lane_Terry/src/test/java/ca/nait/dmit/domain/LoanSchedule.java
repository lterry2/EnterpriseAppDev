package ca.nait.dmit.domain;

public class LoanSchedule 
{
	private int paymentNumber = 0;
	private double interestPaid = 0;
	private double principalPaid = 0;
	private double remainingBalance = 0;
	
	public int getPaymentNumber() 
	{
		return paymentNumber;
	}
	public void setPaymentNumber(int paymentNumber) 
	{
		this.paymentNumber = paymentNumber;
	}
	public double getInterestPaid() 
	{
		return interestPaid;
	}
	public void setInterestPaid(double interestPaid) 
	{
		this.interestPaid = interestPaid;
	}
	public double getPrincipalPaid() 
	{
		return principalPaid;
	}
	public void setPrincipalPaid(double principalPaid) 
	{
		this.principalPaid = principalPaid;
	}
	public double getRemainingBalance() 
	{
		return remainingBalance;
	}
	public void setRemainingBalance(double remainingBalance) 
	{
		this.remainingBalance = remainingBalance;
	}
	
	public LoanSchedule() 
	{
		super();
	}
	
	public LoanSchedule(int paymentNumber, double interestPaid, double principalPaid, double remainingBalance) 
	{
		super();
		this.paymentNumber = paymentNumber;
		this.interestPaid = interestPaid;
		this.principalPaid = principalPaid;
		this.remainingBalance = remainingBalance;
	}
	
}
