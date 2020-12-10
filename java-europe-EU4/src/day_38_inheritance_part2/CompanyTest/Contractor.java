package day_38_inheritance_part2.CompanyTest;

public class Contractor extends Employee {

	@Override
	public void calculatePay(int hours, double rate) {
		double total = (hours * rate) + 200;
		System.out.println("Contractor Employee Total Pay:" + total);

	}

}
