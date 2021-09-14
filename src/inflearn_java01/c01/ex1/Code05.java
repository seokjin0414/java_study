package inflearn_java01.c01.ex1;

public class Code05 {

	public static void main(String[] args) {

		int[] grades = new int[5];

		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;

		for (int i=0; i<grades.length; i++) {
			System.out.println("Grade " + (i + 1) + ": " + grades[i]);
		}
		
		int a = 0;
		
		while(a < grades.length) {
			System.out.println("Grade "+(a+1)+": "+grades[a]); 
			a++;
		}
	}
}
