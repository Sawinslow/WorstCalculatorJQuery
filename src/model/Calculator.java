package model;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private int totalNumber;
	private double seperator;

	public Calculator(int secondNumber,double seperator) {
		super();
		this.secondNumber = secondNumber;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculator(int firstNumber) {
		super();
		this.firstNumber = firstNumber;
	}
	

	public Calculator(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.totalNumber = firstNumber + secondNumber;
		setTotalNumber(this.totalNumber);
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	@Override
	public String toString() {
		setTotalNumber(firstNumber + secondNumber);
		return "Your Total number is: " + totalNumber ;
	}

}
