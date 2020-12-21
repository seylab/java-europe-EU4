package day_40_accessmodifiers_final;

public class FinalVariables {

	public final int ROADSTER_MAX_RANGE = 600;
	public final int MODEL_3_MASPEED;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME;

	public FinalVariables() {

		MODEL_3_MASPEED = 200;

	}

	{
		MODEL_X_PASSENGERS = 7;
	}
	static {
		ADMIN_USERNAME = "Mike";
	}

	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT = 5; // local variables can not access modifiers.
		final int SSN;
		SSN = 66;
		
		FinalVariables finalVars = new FinalVariables();
		System.out.println(finalVars.ROADSTER_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MASPEED);
		System.out.println(FinalVariables.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME);
		
		mA();
		

	}

	public static void mA() {
		 
		
	}

}
