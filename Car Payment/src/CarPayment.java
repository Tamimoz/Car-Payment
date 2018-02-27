public class CarPayment {
	//Creating the variables
	
	private int totalPriceOfCar; //Total price of the car
	
	private int downPayment;
	
	private int lengthOfLoan;
	
	private double interestRate;
	
	public CarPayment (int totalPriceOfCar, int downPayment, int lengthOfLoan, double interestRate) {
		
		super();
		
		this.totalPriceOfCar = totalPriceOfCar;
		
		this.downPayment = downPayment;
		
		this.lengthOfLoan = lengthOfLoan;
		
		this.interestRate = interestRate;
	}
	
	public double TotalInterestPaid() {
		
		return (double) ((interestRate / 12) * (totalPriceOfCar - downPayment))*(lengthOfLoan) / (1 - Math.pow((1+ interestRate/12), (-1 * lengthOfLoan))) - (totalPriceOfCar - downPayment);	
	}
	
	public double MonthlyPayment() {

		return (double) ((interestRate / 12) * (totalPriceOfCar - downPayment)) /((1 - Math.pow((1+ interestRate/12), (-1 * lengthOfLoan))));
	}
		
}
