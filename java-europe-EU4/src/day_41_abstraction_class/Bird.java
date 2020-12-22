package day_41_abstraction_class;

public abstract class Bird extends Animal{
	



	@Override
	void eat() {
		System.out.println("Bird is eating");
	}
/*
	@Override
	public void breathe() {
		System.out.println("Bird is breathing");
	}
	*/
	abstract void fly();
	
}
