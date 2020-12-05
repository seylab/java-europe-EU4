package day_04_aritmeticOperators;

//This progarm calculates hourly plus overtime

public class wages {

	public static void main(String[] args) {
		
		double regularWage; // the calculated regular wage
		double basePay=25.75; //the base pay
		double regularHours=40; // the hours worked less overtine
		double overTimeWages; // Overtime wages
		double overTimePay=37.5; // overtime Pay rate
		double overTimeHours=15;
		double totalWage; // Total wage
		
		regularWage=basePay*regularHours;
		overTimeWages=overTimePay*overTimeHours;
		totalWage=regularWage+overTimeWages;
		System.out.println("Wages for this week are $ " + totalWage);
		
		
		

	}

}
