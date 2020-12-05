package day_09_controlFlowStatements_part3;

public class task39_TrafficLights {

	public static void main(String[] args) {
		// Write a program to display traffic light colors using following logic:
		//if code (R/r)-->"Red"
		//if code (O/o)-->"Orange"
		//if code (G/g)-->"Green"

		char light= 'o';
		
		switch(light) {
		
		case 'R':
		case 'r':
			System.out.println("Red");
			break;
		case 'O':
		case'o':
			System.out.println("Orange");
			break;
		case 'G':
		case'g':
			System.out.println("Green");
			break;
		default:
			System.out.println("Invalid");
			
			
		}
		
	}

}
