package day_07_controFlowStatements;

public class smallTasks {

	public static void main(String[] args) {
		
		//1
		
		int x,y;
		x=10;
		y=20;
		if (y==20){
			x=5;
			} 
		System.out.println("x = "+ x);
		
		//2
		
		int hours=55;
		double salary, payRate;
		payRate=20;
		salary=hours*payRate;
		 if (hours>40) {
			 System.out.println("Salary = " +(salary=(payRate*40)+((hours-40)*1.5*payRate)));
		 }
		 if (hours<=40) {
			 System.out.println("Salary = " + salary);
		 }
		 
		 //3
		 
		 int fees=15;
		 boolean max=true;
		 
		 if (max==true) {
			 fees=50;
		 }
		 System.out.println("Fees : " + (fees));
		 
		 //4
		
		 int a,b,c;
		 a=12;
		 b=50;
		 c=150;
		  if (b==50&c>=100) {
			  a=20;
		  }
		  System.out.println("a = "+a);
		 
		  //5
		  
		  int temp=78;
		  
		  if (temp>70&temp<80) {
			  System.out.println("Ideal Temp");
		  } 

	}

}
