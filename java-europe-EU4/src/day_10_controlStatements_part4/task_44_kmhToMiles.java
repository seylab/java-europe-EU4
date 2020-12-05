package day_10_controlStatements_part4;

public class task_44_kmhToMiles {

	public static void main(String[] args) {
		
		
		System.out.println("KPH           MPH");
		System.out.println("-----------------");
		
		for(int kph=60;kph<=130;kph++) {
			if(kph%10==0) {
			System.out.println(kph+"\t\t" +kph*0.6214);
			
		}
		}

	}

}
