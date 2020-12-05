package day27_array_part4;

public class Task_95_ScoreCalc {

	public static void main(String[] args) {
		double a=0;
		double b=0;
		int [][] point= {
							{68,75,54,80},
							{100,64,20,50},
							{10,35,40,90}
						};
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point[i].length; j++) {
				if (i==0) {
					a+=point[i][j];
				}
				if (j==0) {
					b+=point[i][j];
				}
			}
		}
		System.out.println("Avarage of Student-1 :"+a/point[0].length);
		System.out.println("Total of Math points :"+ b);
	}

}
