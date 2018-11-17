package question1;

public class Car {
	
	int carCost = 0;
	
	double downPayment = 0;
	
	int loanLength = 0;
	
	double interestRate = 0;
	
	public Car(int cost, double down, int length, double interest) {
		
		carCost = cost;
		downPayment = down;
		loanLength = length;
		interestRate = interest;
		
	}
	
	public double monthlyPayment() {
		
		double payment = 1.0 * ((carCost * (interestRate/12))/
				(1- Math.pow(1.0+(interestRate/12), -1.0 * loanLength) ));
		
		return Math.round(payment * 100.0)/100.0;
		
	}
	
	public double totalInterest() {
		
		double monthly = 1.0 * ((carCost * (interestRate/12))/
				(1- Math.pow(1.0+(interestRate/12), -1.0 * loanLength) ));
		
		double interest = 1.0 * ((monthly * loanLength)-carCost);
		
		return Math.round(interest * 100.0)/100.0;
		
	}

}
