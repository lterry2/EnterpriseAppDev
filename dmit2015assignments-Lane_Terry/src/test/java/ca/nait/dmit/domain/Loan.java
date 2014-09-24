package ca.nait.dmit.domain;

public class Loan 
{
	private double mortgageAmount;
	private double annualInterestRate;
	private int amortizationPeriod;
	
	public double getMortgageAmount() 
	{
		return mortgageAmount;
	}
	public void setMortgageAmount(double mortgageAmount) 
	{
		this.mortgageAmount = mortgageAmount;
	}
	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) 
	{
		this.annualInterestRate = annualInterestRate;
	}
	public double getAmortizationPeriod() 
	{
		return amortizationPeriod;
	}
	public void setAmortizationPeriod(int amortizationPeriod) 
	{
		this.amortizationPeriod = amortizationPeriod;
	}
	
	public Loan() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Loan(double mortgageAmount, double annualInterestRate,
			int amortizationPeriod) 
	{
		super();
		this.mortgageAmount = mortgageAmount;
		this.annualInterestRate = annualInterestRate;
		this.amortizationPeriod = amortizationPeriod;
	}
	
	public double getMonthlyPayment()
	{
		double payment = 0.0;
		
		payment = mortgageAmount * ((Math.pow(1 + (annualInterestRate / 200), (1/6)) - 1) 
									/ 
									(1 - Math.pow(Math.pow(1 + (annualInterestRate / 200), 
													(1/6)), -12 * amortizationPeriod)));
		
		return Math.round( payment * 100 ) / 100.0;
	}
	
	public LoanSchedule[] getLoanScheduleArray()
	{
		int numPayments = amortizationPeriod * 12;
		
		LoanSchedule[] loanSchedules = new LoanSchedule[numPayments];
		
		double remainingBalance = mortgageAmount;
		double interestPaid = 0;
		double principalPaid = 0;
		
		double monthlyPercentageRate = (Math.pow(1 + (annualInterestRate / 200), (1/6)) - 1);
		
		for(int i = 0; i < numPayments; i++)
		{	
			interestPaid = monthlyPercentageRate * remainingBalance;
			
			principalPaid = getMonthlyPayment() - interestPaid;
			
			remainingBalance = remainingBalance - interestPaid - principalPaid;
			
			if(remainingBalance < 0)
			{
				remainingBalance = 0;
			}
			
			loanSchedules[i] = new LoanSchedule( i, interestPaid, principalPaid, remainingBalance );
		}
		return loanSchedules;
	}
	
}
