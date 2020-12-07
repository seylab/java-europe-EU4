package day_30_wrapperClass;

public class task_96_ConvertToTemp {

	public static void main(String[] args) {
		
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		//write a program to output: 72 degree is equal to 22.22 celcius
//		String[] arr=str1.split(" ");
//		
//		int fahr =Integer.parseInt(arr[5]);
//		
//		double celcius=(fahr-32)*5/9;
//		System.out.println(fahr+" degree is equal to " + celcius + " celcius");
		
		String[] arr = str1.split("and ");

		arr = arr[1].split(" degree");
		
		String degree = arr[0];
		
		double degreeF = Double.parseDouble(degree);
		
		double degreeC = (degreeF - 32) * 5/9;
		
		System.out.println(degreeF + " degree is equal to " + Math.round(degreeC) + " celcius");
		System.out.println(degreeF + " degree is equal to " + degreeC + " celcius");
		
	}

}
