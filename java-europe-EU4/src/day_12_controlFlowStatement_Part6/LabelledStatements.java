package day_12_controlFlowStatement_Part6;

public class LabelledStatements {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i=0;
		outer:
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						if(i==4) {
							break outer;
						}
					}
			}while(true);
	}

}
