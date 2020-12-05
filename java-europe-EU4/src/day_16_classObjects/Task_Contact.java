package day_16_classObjects;

public class Task_Contact {
	String name;
	String phoneNumber;
	String email;

	public void call() {
		System.out.println("Calling" + name +"...");
	}

	public void sendMessage() {
		System.out.println("sending message to "+ phoneNumber + " | name: "+ name);
	}

	public void sendEmail() {
		System.out.println("Sending email to "+ email + " ....");
	}
}
