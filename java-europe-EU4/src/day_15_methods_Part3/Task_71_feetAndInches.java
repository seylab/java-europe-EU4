package day_15_methods_Part3;

public class Task_71_feetAndInches {

	public static void main(String[] args) {
		
		calcFeetAndInchesToCentimeters(100, 12);
		calcFeetAndInchesToCentimeters(250);
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches>=0) {
			double feet = (int)inches/12;
			double remainingInches=inches%12;
			System.out.println( inches + " inches=" + feet + " feet and " + remainingInches + " inches");
			return calcFeetAndInchesToCentimeters(feet, remainingInches);
		}
		else {
			
			return -1;
		}
		
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if(feet>=0 && inches>=0 && inches <=12) {
			double cm= (feet*12)*2.54 +(inches*2.54);
			
			System.out.println(feet + " feet," + inches + " inches="+ cm + " centimeters");
			return cm;
		}else {
			System.out.println("Invalid feet or inches");
			return -1;
		}
		
	}

}
