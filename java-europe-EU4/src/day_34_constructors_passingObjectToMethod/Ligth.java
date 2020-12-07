package day_34_constructors_passingObjectToMethod;

public class Ligth {

	int noOfWatts;
	boolean indicator;
	String location;
	
	public Ligth() {
		this(0,false);// this(); // calling constructor
		System.out.println("Returning from no-argument constructor no.1");
	}
	
	public Ligth(int watt, boolean ind) {
		this(watt, ind,"X");
		System.out.println("Returning from constructor no.2");
	}

	public Ligth(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from constructor no.3");
	}
	
	
	
	
	
	
}
