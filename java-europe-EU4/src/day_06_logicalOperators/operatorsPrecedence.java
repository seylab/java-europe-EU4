package day_06_logicalOperators;

public class operatorsPrecedence {

	public static void main(String[] args) {
		
		int appleCount= 20;
		int orangesCount = 30;
		int pearsCount= 30;
		
		boolean comp= appleCount<orangesCount||orangesCount>=pearsCount;
		//20<30 || 30>=30 => T || ----- = T
		
		System.out.println(comp);
		
		System.out.println("******************");
		
		//TASK
		String OutsideWeather;
		int Degree;
		OutsideWeather= "Shinny";
		Degree= 70;
		
		boolean comp2 = (!(OutsideWeather=="Rainy"||Degree==70));
		// (!(F || T  = T))=F
		System.out.println(comp2);
		
		System.out.println("******************");
		
		//TASK
		 int b=2;
		 
		 boolean res = ++b==2 || --b==2 && --b==2;
		 //               F          T         F = F
		  System.out.println(res);
		
		  System.out.println("******************");
		  
		  //TASK 
		  
		  boolean x=true, z=true;
		  int y=20;
		  x=(y!=10)||(z=false);
		  //  T    || -------= T
		  
		  System.out.println(x);
		  System.out.println("******************");
		  
		  //TASK
		  double res10,rem,v1,v2;
		  v1=20;
		  v2=80;
		  res10=(v1+v2)*25;
		  rem=res10%40;
		  boolean restask= rem==v1 | rem<=v1;
		  
		  //System.out.println(rem);
		  System.out.println("Reminder is  <= 20: " + restask);
		  System.out.println("Remaining total is equal to 20 or less? - " + (rem<=v1));
		  
		  
		  
	}

}
