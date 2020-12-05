package day_07_controFlowStatements;

public class ifStatements {

	public static void main(String[] args) {
		
		int score = 69;
		
		if (score>=70) {
						
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
		}
		
		if (score<70) {
			
			System.out.println("You need to study much more ");
			System.out.println("Good luck");
			
			
		}
		System.out.println("***************");
		
		
		int sales, bonus;
		double commissionRate, salary;
		
		sales=5200;
		salary=10000;
		
		if(sales>5000) {
			bonus=500;
			commissionRate=1.12;
			
			salary=salary*commissionRate+bonus;
			
			System.out.println("Salary = " + salary);
		}
		

	}

}
