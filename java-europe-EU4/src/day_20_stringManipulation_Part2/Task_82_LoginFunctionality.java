package day_20_stringManipulation_Part2;

import java.util.Scanner;

public class Task_82_LoginFunctionality {

	public static void main(String[] args) {
		
		String userNameInSystem = "aaaa";
		String passwordInSystem = "1111";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Input Your Username");
		String userName= sc.nextLine();
		System.out.println("Please Input Your Password");
		String password= sc.nextLine();
		sc.close();
		
		boolean option1= userName.equals("");
		boolean option2= password.equals("");
		boolean option3= userNameInSystem.equals(userName);
		boolean option4= passwordInSystem.equals(password);
		
		if(option1) {
			if(option2) {
				System.out.println("UserName and Password Fields cannot be empty");
			}else {
				System.out.println("UserName cannot be empty");
			}
		}else if(option2) {
			System.out.println("Password cannot be empty");
			
		}else if(!option3||!option4) {
			System.out.println("UserName or password is not valid. Please verify");
			
		}else if(option3 && option4) {
			System.out.println("User Logged in successfully");
		}
		
		
			
		
		
		
		
		
	}

}
