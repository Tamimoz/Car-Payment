import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarPaymentTest {

	@Test
	void testTotalInterestPaid1() { //First test to the first method (that calculates the total interest paid over the term of the loan)
		CarPayment test = new CarPayment(35000, 0, 60, 0.10); //Total price is $35000, down payment is $0, length of the loan is 60 months, the interest rate is 0.10 (or 10%)
		double expectedValue = 9618.79;
		double result = test.TotalInterestPaid();
		assertEquals (expectedValue, result,0.01);
	}
	
	@Test
	void testTotalInterestPaid2() { //Second test to the first method (that calculates the total interest paid over the term of the loan)
		CarPayment test = new CarPayment(57000, 5000, 72, 0.07); //Total price is $57000, down payment is $5000, length of the loan is 72 months, the interest rate is 0.07 (or 7%)
		double expectedValue = 11831.48;
		double result = test.TotalInterestPaid();
		assertEquals (expectedValue, result,0.01);
	}
	
	@Test
	void testMonthlyPayment1() { //First test to the second method (that calculates the monthly car payments over the term of the loan)
		CarPayment test = new CarPayment(35000, 0, 60, 0.10); //Total price is $35000, down payment is $0, length of the loan is 60 months, the interest rate is 0.10 (or 10%)
		double expectedValue = 743.65;
		double result = test.MonthlyPayment();
		assertEquals (expectedValue, result,0.01);
	}
	
	@Test
	void testMonthlyPayment2() { //Second test to the second method (that calculates the monthly car payments over the term of the loan)
		CarPayment test = new CarPayment(57000, 5000, 72, 0.07); //Total price is $57000, down payment is $5000, length of the loan is 72 months, the interest rate is 0.07 (or 7%)
		double expectedValue = 886.55;
		double result = test.MonthlyPayment();
		assertEquals (expectedValue, result,0.01);
	}
}	
