public class CarPayment {
	//Creating the variables
	
	private int totalPriceOfCar; //Total price of the car (sticker price + taxes + extras)
	
	private int downPayment; //Amount of down payment placed on the car
	
	private int lengthOfLoan; //Length of the loan in months
	
	private double interestRate; //Interest rate for the loan
	
	public CarPayment (int totalPriceOfCar, int downPayment, int lengthOfLoan, double interestRate) {
		
		super();
		
		//Constructors:
		
		this.totalPriceOfCar = totalPriceOfCar;
		
		this.downPayment = downPayment;
		
		this.lengthOfLoan = lengthOfLoan;
		
		this.interestRate = interestRate;
	}
	
	//Methods:
	
	//Method to calculate the total amount of interest spent over the term of the loan:
	
	public double TotalInterestPaid() {
		
		return (double) ((interestRate / 12) * (totalPriceOfCar - downPayment))*(lengthOfLoan) / (1 - Math.pow((1+ interestRate/12), (-1 * lengthOfLoan))) - (totalPriceOfCar - downPayment);	
	}
	
	//Method to calculate the monthly car payment:
	
	public double MonthlyPayment() {

		return (double) ((interestRate / 12) * (totalPriceOfCar - downPayment)) /((1 - Math.pow((1+ interestRate/12), (-1 * lengthOfLoan))));
	}
		
}
