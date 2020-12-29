package day_44_oop_practice.callcenter;

public class CallCenter {

	public static void main(String[] args) {

		WhatsApp wa = new WhatsApp();
		wa.launch();
		wa.allOSCompatible = true;
		wa.isFree = true;
		wa.name = "WhatsApp";
		wa.call("Mehmet");
		wa.sendMESSAGE("Thank you");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getCount();
		wa.setCount(4);
		
		System.out.println("+++++++++++++++++++++++++++");
		
		
		VideoCallable obj = new WhatsApp();
		obj.call("Seyma");
		
		((MessagingApp)obj).launch();
		((MessagingApp)obj).allOSCompatible = false;
		obj.call("Mr Tom");
		((WhatsApp)obj).videoCall();
		((VideoCallable)obj).videoCall();
		
		
		
	}

}
