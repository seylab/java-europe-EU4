package day_44_oop_practice.callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable,VideoCallable {

	@Override
	public void videoCall() {
		System.out.println("WhatsApp - doing a video call Mr mike...");
		
	}

	@Override
	public void call(String contact) {
		System.out.println("WhatsApp - calling " + contact + "...");
		
	}

	@Override
	void sendMESSAGE(String msg) {
		System.out.println("WhatsApp - sending a message - " + msg + "...");
		
	}



}
