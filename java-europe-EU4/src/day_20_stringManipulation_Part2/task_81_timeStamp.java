package day_20_stringManipulation_Part2;

public class task_81_timeStamp {

	public static void main(String[] args) {
		
		String date = "10/10/2019 15:42:00";
		timeStamp(date);
	}
	public static String timeStamp(String date) {
		date=date.replace("/", "").replace(" ", "").replace(":", "");
		System.out.println(date);
		return date;
	}
}
