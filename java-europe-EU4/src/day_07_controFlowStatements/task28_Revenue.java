package day_07_controFlowStatements;

public class task28_Revenue {

	public static void main(String[] args) {
		double d,r,p,q;
		q=1200;
		p=25;
		d=5000;
		r=q*p;
		
		if(r>d) {
		  r=9*r/10;
			System.out.println("Discount is %10");
			System.out.print("Net Revenue is : ");
			System.out.println(r);
		}
		System.out.println("Revenue: " +(r));

	}

}
