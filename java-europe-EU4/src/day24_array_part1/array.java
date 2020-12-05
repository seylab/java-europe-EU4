package day24_array_part1;

public class array {

	public static void main(String[] args) {
		
		int[] mylist ={10,20,30,40};
		
		String[] myArray = {"Apple","Orange","Watermelon"};
		System.out.println(mylist[0]);
		System.out.println(mylist[1]);
		System.out.println(mylist[2]);
		System.out.println(mylist[3]);
		
		System.out.println(mylist.length);
		System.out.println(myArray.length);
		
		for(int i=0;i<mylist.length;i++) {
			System.out.println(mylist[i]);
		}
		
		int[] scores= {80,90,100,35,60,72,64,30,10,5,3,99,89,80,90,100,35,60,72,64,30,10,5,3,99,89};
		int sum=0;
		
		for (int i = 0; i < scores.length; i++) {

			sum=scores[i]+sum;
		}
		System.out.println("Sum is:" + sum);
		System.out.println("Total element in array is:" +scores.length);
		int average=sum/scores.length;
		System.out.println(average);
	}

}
