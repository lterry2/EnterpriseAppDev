package ca.nait.dmit.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoanTest 
{

	@Test
	public void test1() 
	{
		Loan loan = new Loan(250000, 5.29, 25);
		assertEquals(1495.56, loan.getMonthlyPayment(), 0.5);
	}

}
