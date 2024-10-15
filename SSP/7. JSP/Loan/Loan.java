package p1;

import java.time.LocalDate;

public class Loan {
	private double loanAmount;
	private double intRate;
	private double numYear;
	private LocalDate loanDate;
	
	public Loan() {
		this (7.5, 30, 1000000);
	}

	public Loan(double loanAmount, double intRate, double numYear) {
		super();
		this.loanAmount = loanAmount;
		this.intRate = intRate;
		this.numYear = numYear;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getIntRate() {
		return intRate;
	}

	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}

	public double getNumYear() {
		return numYear;
	}

	public void setNumYear(double numYear) {
		this.numYear = numYear;
	}

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(LocalDate loanDate) {
		this.loanDate = loanDate;
	}
	
	public double MonthlyPayment() {
		double monthlyIntrestRate = (intRate/100)/12;
		int numberOfpayments = (int) (numYear * 12);
		return(loanAmount * monthlyIntrestRate)/(1-Math.pow(1+monthlyIntrestRate,  -numberOfpayments));
	}
	
	public double TotalPayment() {
		return MonthlyPayment() * numYear * 12;
	}
	
	
	
	
}
