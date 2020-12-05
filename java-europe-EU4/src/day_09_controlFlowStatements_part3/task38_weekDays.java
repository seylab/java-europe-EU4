package day_09_controlFlowStatements_part3;

public class task38_weekDays {

	public static void main(String[] args) {
		
		// Write a program to display days: 1-Monday, 2-Tuesday, 3-Wednesday, 4-Thursday
		// 5-Friday, 6-Saturday
		
		int days=13;
		
		switch (days) {
		case 1:
			System.out.println("1-Monday");
			break;
		case 2:
			System.out.println("2-Tuesday");
			break;
		case 3:
			System.out.println("3-Wednesday");
			break;
		case 4:
			System.out.println("4-Thursday");
			break;
		case 5:
			System.out.println("5-Friday");
			break;
		case 6:
			System.out.println("6-Saturday");
			break;
		default:
			System.out.println("No such a day");	
								
		}

	}

}
